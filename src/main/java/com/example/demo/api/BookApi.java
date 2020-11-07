package com.example.demo.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResultModel;
import com.example.demo.po.Books;
import com.example.demo.po.Collect;
import com.example.demo.service.BooksService;
import com.example.demo.service.CollectService;
import com.example.demo.utils.ResultTools;
import com.example.demo.viewModel.BookPaiVM;
import com.example.demo.viewModel.BookResponseVM;
import com.github.pagehelper.PageHelper;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookApi {
	@Autowired 
	private BooksService bookService;
	@Autowired
	private CollectService collectService;
	@RequestMapping(value = { "/search" }, method = RequestMethod.GET)
	public ResultModel selectbookBy(String query, Integer cid, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize) {
		System.out.println(cid);	
		try {
				if (query !=null) {
					
				PageHelper.startPage(pageNum, pageSize);// 分页配置
				List<Books> books = bookService.queryNavName(query);
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", books);
				return ResultTools.result(0, "", map);
				}else if (cid >=0) {
					List<Books> books = bookService.bookCaId(cid);
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("content", books);
					return ResultTools.result(0, "", map);
				}else {
					return ResultTools.result(1001, "", null);
				}
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}

	}

	 
	@RequestMapping(value = { "/detail" }, method = RequestMethod.GET)
	public ResultModel selectBookById(Integer book_id) {
		try {
			if (null == book_id) {
				return ResultTools.result(1001, "", null);
			}
			Books books = bookService.getById(book_id);
			if (null == books) {
				return ResultTools.result(1002, "", null);
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", books);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}

	}
	
	@RequestMapping(value = { "/qsearch" }, method = RequestMethod.GET)
	public ResultModel selectbookByname(String bname) {
			try {
				if (bname ==null) {
					return ResultTools.result(1001, "", null);
				}
				List<Books> books = bookService.queryNavName(bname);
				List<BookResponseVM> vms=new ArrayList<BookResponseVM>(); 
				for(Books book:books) {
					BookResponseVM vm=new BookResponseVM();
					vm.setId(book.getBookId());
					vm.setBookImg(book.getBookImg());
					vm.setBookAuthor(book.getBookAuthor());
					vm.setBookPress(book.getBookPress());
					vm.setBookBrief(book.getBookBrief());
					vm.setBookName(book.getBookName());
					vm.setBorrowNumber(book.getBorrowNumber());
					vm.setCollectNumber(book.getCollectNumber());
					vms.add(vm);
				}
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", vms);
				return ResultTools.result(0, "", map);
				
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}
	}
	@RequestMapping(value = { "/bookpai" }, method = RequestMethod.GET)
	   public ResultModel getbookByLimit() {
	       try {
				
				List<Books> books = bookService.selectByLimit();
				List<BookPaiVM> bvm=new ArrayList<BookPaiVM>(); 
				for(Books book:books) {
					BookPaiVM vm=new BookPaiVM();
					vm.setBookid(book.getBookId());
					vm.setBookname(book.getBookName());
					vm.setBookAuthor(book.getBookAuthor());
					vm.setBookImg(book.getBookImg());
					vm.setBookIn(book.getBookBrief());
					vm.setBorrowNumber(book.getBorrowNumber());
					vm.setCollectNumber(book.getCollectNumber());
					bvm.add(vm);
				}
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", bvm);
				return ResultTools.result(0, "", map);
				
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}

	}
	@RequestMapping(value = { "/booktime" }, method = RequestMethod.GET)
	   public ResultModel getbookByTime() {
	      int i =0;
	       try {
				
				List<Books> books = bookService.selectBytime();
				List<BookPaiVM> bvm=new ArrayList<BookPaiVM>(); 
				for(Books book:books) {
					BookPaiVM vm=new BookPaiVM();
					vm.setBookid(book.getBookId());
					vm.setBookname(book.getBookName());
					vm.setBookAuthor(book.getBookAuthor());
					vm.setBookImg(book.getBookImg());
					vm.setBookIn(book.getBookBrief());
					bvm.add(vm);
				}
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", bvm);
				return ResultTools.result(0, "", map);
				
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}

	}
	
	@RequestMapping(value = { "/booklike" }, method = RequestMethod.GET)
	   public ResultModel getbookByLike(Integer uid) {
	       try {
				List<Collect> collects = collectService.userCollect(uid);
				List<Books> books = new ArrayList<Books>();
				for (Collect collect:collects) {
					books.add(bookService.bookCaIdByBid(collect.getBookId()));
				}
				Collections.sort(books, new Comparator<Books>() {  
					  
		            @Override  
		            public int compare(Books o2, Books o1) {  
		                int i = o1.getBorrowNumber() - o2.getBorrowNumber();  
		                if(i == 0){  
		                    return o1.getBorrowNumber() - o2.getBorrowNumber();  
		                }  
		                return i;  
		            }  
		        });
				List<Books> bookList=bookService.bookRecommend(books.get(0).getCaId());
				
			Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", bookList);
				return ResultTools.result(0, "", map);
				
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}

	}
	
}
