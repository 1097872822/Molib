package com.example.demo.api;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResultModel;
import com.example.demo.po.Clientuser;
import com.example.demo.po.Comments;
import com.example.demo.service.ClientuserSerivce;
import com.example.demo.service.CommentsService;
import com.example.demo.utils.ResultTools;
@RestController
@RequestMapping("/api/comment")
@CrossOrigin
public class CommentsApi {
	@Autowired
	private CommentsService commentsService;
	@Autowired
	private ClientuserSerivce clientuserSerivce;
	// 查询全部
	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public ResultModel selectCommentByBookId(Integer book_id) {
		try {
			List<Comments> comments = commentsService.SelectByBookId(book_id);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", comments);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}
   	@RequestMapping(value = { "/incomment" }, method = RequestMethod.GET)
   	public ResultModel addallUserBycollect(Integer uid,Integer bookid,String comment) {
   		try {
   			System.out.println("aaa");
   			Clientuser clientuser= clientuserSerivce.getById(uid);
//   			Books book =booksService.getById(bookid);
//   			String bookname = book.getBookName();
   			Comments comments = new Comments();
   			comments.setBookId(bookid);
   			comments.setuNo(clientuser.getuNo());
   			comments.setuName(clientuser.getuName());
//   			comments.setBookName(book.getBookName());
   			Date day=new Date(); 
   			comments.setcTime(day);
   			comments.setcConcent(comment);
   			comments.setcState("0");;
   			Integer bor=commentsService.add(comments);
   			Map<String, Object> map = new HashMap<String, Object>();
   			map.put("content", bor);
   			return ResultTools.result(0, "", map);
   		} catch (Exception e) {
   			return ResultTools.result(404, e.getMessage(), null);
   		}
   	}


}
