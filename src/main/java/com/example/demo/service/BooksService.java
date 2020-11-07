package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.po.Books;
@Service
public interface BooksService extends BaseService<Books, Integer>{
	
	List<Books> queryNavName(String name);
	List<Books> getBooksList(List<Books> bookList);
	List<Books> bookCaId(Integer cid);
	List<Books> bookPai();
	List<Books> selectByLimit();
	List<Books> selectBytime();
//	int updateBorrow(Books t);
	int updates(Books t);
	List<Books>selectNum(String bookname);
	Books bookCaIdByBid(Integer bookid);
	List<Books> bookRecommend(Integer cid);
}
