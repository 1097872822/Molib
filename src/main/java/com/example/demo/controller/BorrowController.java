package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Books;
import com.example.demo.po.Borrow;
import com.example.demo.po.Borrowrecord;
import com.example.demo.po.Clientuser;
import com.example.demo.service.BooksService;
import com.example.demo.service.BorrowService;
import com.example.demo.service.BorrowrecordService;
import com.example.demo.service.ClientuserSerivce;

@Controller
@RequestMapping("/borrow")
public class BorrowController {
	@Autowired private BorrowService borrowService;
	@Autowired private ClientuserSerivce clientuserSerivce;
	@Autowired private BooksService booksService;
	@Autowired private BorrowrecordService  borrowrecordService;
	@RequestMapping("/index")
	public String getAll(Model model) {
		List<Borrow> borrows =borrowService.getAll();
		model.addAttribute("borrows", borrows);
		return "borrow/list";
	}
	@RequestMapping("/toedit")
	public String toEdit(Model model,Integer id) {
		Borrow borrow = borrowService.getById(id);
		model.addAttribute("borrow", borrow);
		return "borrow/edit";
	}
	@RequestMapping("/edit")
	public String edit(Borrow borrow) {
		Integer id =borrow.getBookId();
		Borrow borrows =borrowService.getById(id);
		Integer uid=borrow.getuId();
		Integer bookid=borrow.getBookId();
		
		if (borrows !=null) {
			borrowService.update(borrow);
		}else {
			borrow.setAddTime(new Date());
			borrowService.add(borrow);
			Clientuser clientuser=clientuserSerivce.getById(uid);
			Integer bornum = clientuser.getuBorrow();
			bornum=bornum+1;
			Clientuser clientuser2 = new Clientuser();
			clientuser2.setuId(uid);
			clientuser2.setuBorrow(bornum);
			Books books = booksService.getById(bookid);
			Integer bornu = books.getBorrowNumber();
			Integer booknum=books.getBookNumber();
			Books books2 = new Books();
			books2.setBookId(bookid);
			books2.setBookNumber(booknum-1);
			books2.setBorrowNumber(bornu+1);
			booksService.updates(books2);
			clientuserSerivce.update(clientuser2);
			
			
		}
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer id,Integer uno,String bookname) {
		borrowService.delete(id);
	List<Borrowrecord> borrowrecords=borrowrecordService.useronlyBorrow(uno, bookname);
	for (Borrowrecord borrowrecord:borrowrecords){
		if(borrowrecord.getState()==0) {
			Integer bohuaid = borrowrecord.getBohuaiId();
			Borrowrecord borrowrecord2 = new Borrowrecord();
			borrowrecord2.setBohuaiId(bohuaid);
			borrowrecord2.setState(1);
			borrowrecord2.setBackTime(new Date());
		borrowrecordService.update(borrowrecord2);
		}
	}
	List<Books>books = booksService.selectNum(bookname);
	for (Books books2 :books) {
		Integer index=books2.getBookId();
		Books books3=new Books();
		books3.setBookId(index);
		books3.setBookNumber(books2.getBookNumber()+1);
		booksService.update(books3);
	}
		return "redirect:index";
	}

}
