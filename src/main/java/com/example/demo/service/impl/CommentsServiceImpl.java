package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CommentsMapper;
import com.example.demo.po.Comments;
import com.example.demo.service.CommentsService;
@Service
public class CommentsServiceImpl implements CommentsService {
@Autowired private CommentsMapper commentsMapper;
	@Override
	public List<Comments> getAll() {
		// TODO Auto-generated method stub
		return commentsMapper.selectByExample(null);
	}

	@Override
	public int add(Comments t) {
		// TODO Auto-generated method stub
		return commentsMapper.insertSelective(t);
	}

	@Override
	public int update(Comments t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Comments getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> SelectByBookId(Integer bookid) {
		// TODO Auto-generated method stub
		return commentsMapper.selectByBookId(bookid);
	}

}
