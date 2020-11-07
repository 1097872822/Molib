package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.po.Borrow;
@Service
public interface BorrowService extends BaseService<Borrow, Integer>{
	List<Borrow> userBorrow(Integer uid) ;
	List<Borrow> bookBorrowASC();
	void sendMimeMail(String to,String bookname) ;
	
}
