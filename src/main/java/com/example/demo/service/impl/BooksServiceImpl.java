package com.example.demo.service.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BooksMapper;
import com.example.demo.po.Books;
import com.example.demo.po.BooksExample;
import com.example.demo.po.BooksExample.Criteria;
import com.example.demo.service.BooksService;
@Service
public class BooksServiceImpl implements BooksService {

	@Autowired 
	private BooksMapper booksMapper;
	@Override
	public List<Books> getAll() {
		// TODO Auto-generated method stub
		return booksMapper.selectByExample(null);
	}

	@Override
	public int add(Books t) {
		// TODO Auto-generated method stub
		return booksMapper.insertSelective(t);
	}

	@Override
	public int update(Books t) {
		// TODO Auto-generated method stub
		return booksMapper.updateByPrimaryKeySelective(t);
	}


	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return booksMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Books getById(Integer id) {
		// TODO Auto-generated method stub
		return booksMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Books> queryNavName(String name) {
		// TODO Auto-generated method stub
		BooksExample example=new BooksExample();
		Criteria criteria=example.createCriteria();
		criteria.andBookNameLike("%" + name + "%");
		return booksMapper.selectByExample(example);
	}

//	@Override
//	public List<Books> getBooksList(List<Books> bookList) {
//		// TODO Auto-generated method stub
//		for (Books book :bookList) {
//			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//			System.out.println(book.getAddTime().toString());
//			Date creationString = Date.valueOf(book.getAddTime().toString());
//			book.setDataString(simpleDateFormat.format(creationString));
//		}
//		return bookList;
//	}

	@Override
	public List<Books> bookCaId(Integer cid) {
		// TODO Auto-generated method stub
			BooksExample example=new BooksExample();
			Criteria criteria=example.createCriteria();
			criteria.andCaIdEqualTo(cid);
			return booksMapper.selectByExample(example);
		
	}
	public Books bookCaIdByBid(Integer bookid) {
		BooksExample example=new BooksExample();
		Criteria criteria=example.createCriteria();
		criteria.andBookIdEqualTo(bookid);
		List<Books> books = booksMapper.selectByExample(example);
		return books.get(0);
	}
	
//	@Override
//	public  bookCaIdByCount(List<Books> books) {
//		// TODO Auto-generated method stub
//			BooksExample example=new BooksExample();
//			Criteria criteria=example.createCriteria();
//			criteria.andCaIdEqualTo(cid);
//			return booksMapper.selectByExample(example);
//		
//	}
	
	@Override
	public List<Books> bookPai() {
		BooksExample example = new BooksExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("borrowNumber desc");
		return booksMapper.selectByExample(example);
	}
	 /*
     * 传入开始显示记录的索引，即显示记录的条数，实现分页显示功能
     */
	@Override
	public List<Books> selectByLimit() {
		// TODO Auto-generated method stub
		 return booksMapper.selectByLimit(null);
	}

	@Override
	public List<Books> selectBytime() {
		// TODO Auto-generated method stub
		return booksMapper.selectBytime(null);
	}

	@Override
	public int updates(Books t) {
		// TODO Auto-generated method stub
		
		return booksMapper.updateByPrimaryKey(t);
	}

	@Override
	public List<Books> getBooksList(List<Books> bookList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Books> selectNum(String bookname) {
		// TODO Auto-generated method stub
		BooksExample example = new BooksExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookNameEqualTo(bookname);
		return booksMapper.selectByExample(example);
	}

	@Override
	public List<Books> bookRecommend(Integer cid) {
		// TODO Auto-generated method stub
		
		return booksMapper.selectByCaid(cid);
	}



//	@Override
//	public int updateBorrow(Books t) {
//		// TODO Auto-generated method stub
//		Books book=new Books();
//		book.setBookId(t.getBookId());
//		book.setBookNumber(t.getBookNumber());
//		book.setBorrowNumber(t.getBorrowNumber());
//		return booksMapper.updateByPrimaryKey(book);
//	}


}
