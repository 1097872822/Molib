package com.example.demo.api;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResultModel;
import com.example.demo.po.Books;
import com.example.demo.po.Borrow;
import com.example.demo.po.Borrowrecord;
import com.example.demo.po.Categoryindex;
import com.example.demo.po.Clientuser;
import com.example.demo.po.Collect;
import com.example.demo.service.BooksService;
import com.example.demo.service.BorrowService;
import com.example.demo.service.BorrowrecordService;
import com.example.demo.service.ClientuserSerivce;
import com.example.demo.service.CollectService;
import com.example.demo.utils.ResultTools;
import com.example.demo.viewModel.BookPaiVM;
import com.example.demo.viewModel.PersonPaiVM;

import lombok.Data;

@RestController
@RequestMapping("/api/home")
@CrossOrigin
public class UserApi {
	@Autowired ClientuserSerivce clientuserSerivce;
	@Autowired private BorrowService borrowService;
	@Autowired private BooksService booksService;
	@Autowired private CollectService collectService;
	@Autowired private BorrowrecordService borrowrecordService;
	
	@RequestMapping(value = { "/client" }, method = RequestMethod.GET)
	
	public ResultModel selectUser(Integer userno,String password) {
		try {
			if (userno >0&& password !=null) {
				Clientuser user = clientuserSerivce.clientNo(userno);
				if (user.getuPwd().equals(password)) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", user);
				return ResultTools.result(0, "", map);
				}
				else {
					System.out.println(user.getuNo());
					System.out.println(password);
					return ResultTools.result(1005,"", null);
				}
				
			}
			else {
				return ResultTools.result(1001, "", null);
				}
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}
		
		
	}
	
	@RequestMapping(value = { "/peoplepai" }, method = RequestMethod.GET)
	   public ResultModel getUserByLimit() {
	       try {
				
				List<Clientuser> clients = clientuserSerivce.selectByLimit();
				List<PersonPaiVM> pvm=new ArrayList<PersonPaiVM>(); 
				for(Clientuser client:clients) {
					PersonPaiVM vm=new PersonPaiVM();
					vm.setUId(client.getuId());
					vm.setUNo(client.getuNo());
					vm.setUName(client.getuName());
					vm.setUBorrow(client.getuBorrow());
					pvm.add(vm);
				}
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", pvm);
				return ResultTools.result(0, "", map);
				
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}
	}
	 
	@RequestMapping(value = { "/changePwd" }, method = RequestMethod.POST)
	   	public ResultModel changePwd(Integer uid,String password) {
	   		try {
	   			if (uid>0&& password !=null) {
	   				Clientuser userpwd =new Clientuser();
	   				userpwd.setuId(uid);
	   				userpwd.setuPwd(password);
	   				int zhi =clientuserSerivce.update(userpwd);
	   				Clientuser newuserpwd = clientuserSerivce.getById(uid);
	   				Map<String, Object> map = new HashMap<String, Object>();
	   				map.put("content", newuserpwd);
	   				return ResultTools.result(0, "", map);
	   				}
	   			else {
	   				return ResultTools.result(1001, "", null);
	   				}
	   			} catch (Exception e) {
	   				return ResultTools.result(404, e.getMessage(), null);
	   			}
	   		
	}
	   	
	// 查询全部
	   	@RequestMapping(value = { "/borrow" }, method = RequestMethod.GET)
	   	public ResultModel selectUserByborrow(Integer uId) {
	   		try {
	   			List<Borrow> borrows = borrowService.userBorrow(uId);
	   			Map<String, Object> map = new HashMap<String, Object>();
	   			map.put("content", borrows);
	   			return ResultTools.result(0, "", map);
	   		} catch (Exception e) {
	   			return ResultTools.result(404, e.getMessage(), null);
	   		}
	   	}
	   
	   	@RequestMapping(value = { "/newborrow" }, method = RequestMethod.GET)
	   	public ResultModel addUserByborrow(Integer uid,Integer bookid) {
	   		try {
	   			Clientuser clientuser= clientuserSerivce.getById(uid);
	   			Books book =booksService.getById(bookid);
	   			String bookname = book.getBookName();
	   			Borrow borrow = new Borrow();
	   			borrow.setuId(uid);
	   			borrow.setuNo(clientuser.getuNo());
	   			borrow.setuName(clientuser.getuName());
	   			borrow.setBookId(bookid);
	   			borrow.setBookName(book.getBookName());
	   			borrow.setBookImg(book.getBookImg());
	   			Date day=new Date(); 
	   			Calendar rightNow = Calendar.getInstance();
	   	        rightNow.setTime(day);
//	   	        rightNow.add(Calendar.YEAR,-1);//日期减1年
//	   	        rightNow.add(Calendar.MONTH,3);//日期加3个月
	   	        rightNow.add(Calendar.DAY_OF_YEAR,30);//日期加10天
	   	        Date dt1=rightNow.getTime();
//	   	        String reStr = sdf.format(dt1);
	   			borrow.setAddTime(day);
	   			borrow.setStopTime(dt1);
	   			Integer bor=borrowService.add(borrow);
//	   			学生表借阅数量修改
	   			Integer stunum =clientuser.getuBorrow();
	   			Clientuser clientuser2 = new Clientuser();
	   			clientuser2.setuId(uid);
	   			clientuser2.setuBorrow(stunum+1);
	   			clientuserSerivce.update(clientuser2);
	   			Clientuser newclientuser= clientuserSerivce.getById(uid);
//		   		书籍借阅数量修改、库存	
	   			Integer booknum = book.getBookNumber();
	   			Integer bookbor = book.getBorrowNumber();
	   			Books books = new Books();
	   			books.setBookId(bookid);
	   			books.setBookNumber(booknum-1);
	   			booksService.update(books);
	   			Books book2 = new Books();
	   			book2.setBookId(bookid);
	   			book2.setBorrowNumber(bookbor+1);
	   			booksService.update(book2);
////	   			定时提醒
//	   			Timer timer = new Timer();
//	   		    timer.schedule(new TimerTask() {
//
//	   		        @Override
//	   		        public void run() {
//	   		            System.out.println("系统正在运行……");
//	   		            borrowService.sendMimeMail(clientuser.getuQq(), bookname);
//	   		        }
//	   		    }, 5000); //在指定的日期运行一次定时任务
	   			Map<String, Object> map = new HashMap<String, Object>();
	   			map.put("content", newclientuser);
	   			return ResultTools.result(0, "", map);
	   		} catch (Exception e) {
	   			return ResultTools.result(404, e.getMessage(), null);
	   		}
	   	}
		// 延长期限
	   	@RequestMapping(value = { "/addtime" }, method = RequestMethod.GET)
	   	public ResultModel updatetimeByborrow(Integer borrowId) {
	   		try {
	   			Borrow borrows = borrowService.getById(borrowId);
	   			Calendar rightNow = Calendar.getInstance();
	   	        rightNow.setTime(borrows.getStopTime());
	   	        System.out.println(rightNow);
//	   	        rightNow.add(Calendar.YEAR,-1);//日期减1年
//	   	        rightNow.add(Calendar.MONTH,3);//日期加3个月
	   	        rightNow.add(Calendar.DAY_OF_YEAR,30);//日期加10天
	   	        Date dt1=rightNow.getTime();
	   	     System.out.println(dt1);
	   	        Borrow borrow4 =new Borrow();
	   			borrow4.setBookId(borrowId);
	   			borrow4.setStopTime(dt1);
	   			Integer con = borrowService.update(borrow4);
	   			Borrow borrow2 = borrowService.getById(borrowId);
	   			Map<String, Object> map = new HashMap<String, Object>();
	   			map.put("content", con);
	   			return ResultTools.result(0, "", map);
	   		} catch (Exception e) {
	   			return ResultTools.result(404, e.getMessage(), null);
	   		}
	   	}
	   
	 // 查询收藏全部
	   	@RequestMapping(value = { "/collect" }, method = RequestMethod.GET)
	   	public ResultModel selectUserBycollect(Integer uId) {
	   		try {
	   			List<Collect>collects = collectService.userCollect(uId);
	   			Map<String, Object> map = new HashMap<String, Object>();
	   			map.put("content", collects);
	   			return ResultTools.result(0, "", map);
	   		} catch (Exception e) {
	   			return ResultTools.result(404, e.getMessage(), null);
	   		}
	   	}
	   	
	   	
	   	@RequestMapping(value = { "/newcollect" }, method = RequestMethod.GET)
	   	public ResultModel addUserBycollect(Integer uid,Integer bookid) {
	   		try {
	   			Books book =booksService.getById(bookid);
	   			Collect collect = new Collect();
	   			collect.setuId(uid);
	   			collect.setBookId(bookid);
	   			collect.setBookName(book.getBookName());
	   			collect.setBookImg(book.getBookImg());
	   			Integer col=collectService.add(collect);
//		   		书籍收藏数量修改	
	   			Integer bookcol = book.getCollectNumber();
	   			Books book2 = new Books();
	   			book2.setBookId(bookid);
	   			book2.setCollectNumber(bookcol+1);
	   			booksService.update(book2);
	   			Map<String, Object> map = new HashMap<String, Object>();
	   			map.put("content", collect);
	   			return ResultTools.result(0, "", map);
	   		} catch (Exception e) {
	   			return ResultTools.result(404, e.getMessage(), null);
	   		}
	   	}
	   	
	   	@RequestMapping(value = { "/delectcollect" }, method = RequestMethod.GET)
	   	public ResultModel delectUserBycollect(Integer uid,Integer bookid) {
	   		try {
	   			Books book =booksService.getById(bookid);
	   			Integer dcol=collectService.delectCollect(uid, bookid);
	   			Map<String, Object> map = new HashMap<String, Object>();
	   			map.put("content", dcol);
	   			return ResultTools.result(0, "", map);
	   		} catch (Exception e) {
	   			return ResultTools.result(404, e.getMessage(), null);
	   		}
	   	}
		// 查询借阅记录
	   	@RequestMapping(value = { "/allborrow" }, method = RequestMethod.GET)
	   	public ResultModel selectUserByAllborrow(Integer uId) {
	   		try {
	   			List<Borrowrecord> borrowrecords = borrowrecordService.userallBorrow(uId);
	   			Map<String, Object> map = new HashMap<String, Object>();
	   			map.put("content", borrowrecords);
	   			return ResultTools.result(0, "", map);
	   		} catch (Exception e) {
	   			return ResultTools.result(404, e.getMessage(), null);
	   		}
	   	}
	   	
	   	@RequestMapping(value = { "/inallborrow" }, method = RequestMethod.GET)
	   	public ResultModel addallUserBycollect(Integer uid,Integer bookid) {
	   		try {
	   			Clientuser clientuser= clientuserSerivce.getById(uid);
	   			Books book =booksService.getById(bookid);
	   			String bookname = book.getBookName();
	   			Borrowrecord borrowrecord = new Borrowrecord();
	   			borrowrecord.setuId(uid);
	   			borrowrecord.setuNo(clientuser.getuNo());
	   			borrowrecord.setuName(clientuser.getuName());
	   			borrowrecord.setBookName(book.getBookName());
	   			borrowrecord.setBookImg(book.getBookImg());
	   			Date day=new Date(); 
	   			borrowrecord.setBorrowTime(day);
	   			Integer bor=borrowrecordService.add(borrowrecord);
	   			Map<String, Object> map = new HashMap<String, Object>();
	   			map.put("content", bor);
	   			return ResultTools.result(0, "", map);
	   		} catch (Exception e) {
	   			return ResultTools.result(404, e.getMessage(), null);
	   		}
	   	}
	   	
}
