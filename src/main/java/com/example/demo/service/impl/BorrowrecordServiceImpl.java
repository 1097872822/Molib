package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BorrowrecordMapper;
import com.example.demo.po.BorrowExample;
import com.example.demo.po.Borrowrecord;
import com.example.demo.po.BorrowrecordExample;
import com.example.demo.po.BorrowrecordExample.Criteria;
import com.example.demo.service.BorrowrecordService;
@Service
public class BorrowrecordServiceImpl implements BorrowrecordService {
@Autowired private BorrowrecordMapper borrowrecordMapper;
	@Override
	public List<Borrowrecord> getAll() {
		// TODO Auto-generated method stub
		BorrowrecordExample example=new BorrowrecordExample();
		example.setOrderByClause("borrow_time desc");
		return borrowrecordMapper.selectByExample(example);
	}

	@Override
	public int add(Borrowrecord t) {
		// TODO Auto-generated method stub
		return borrowrecordMapper.insertSelective(t);
	}

	@Override
	public int update(Borrowrecord t) {
		// TODO Auto-generated method stub
		return borrowrecordMapper. updateByPrimaryKeySelective(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return borrowrecordMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Borrowrecord getById(Integer id) {
		// TODO Auto-generated method stub
		return borrowrecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Borrowrecord> userallBorrow(Integer uid) {
		// TODO Auto-generated method stub
		BorrowrecordExample example=new BorrowrecordExample();
		Criteria criteria=example.createCriteria();
		criteria.andUIdEqualTo(uid);
		return borrowrecordMapper.selectByExample(example);
	}

	@Override
	public List<Borrowrecord> useronlyBorrow(Integer uNo,String bookName) {
		// TODO Auto-generated method stub
		BorrowrecordExample example=new BorrowrecordExample();
		Criteria criteria=example.createCriteria();
		criteria.andUNoEqualTo(uNo);
		criteria.andBookNameEqualTo(bookName);
		return  borrowrecordMapper.selectByExample(example);
	}

}
