package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.po.Borrowrecord;
@Service
public interface BorrowrecordService extends BaseService<Borrowrecord, Integer>{
	List<Borrowrecord> userallBorrow(Integer uid);
	List<Borrowrecord> useronlyBorrow(Integer uno,String bookname);
}
