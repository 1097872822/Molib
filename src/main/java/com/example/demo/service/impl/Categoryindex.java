package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CategoryindexMapper;
import com.example.demo.service.CategoryindexService;

@Service
public class Categoryindex implements CategoryindexService {

	@Autowired private CategoryindexMapper categoryindexMapper;
	@Override
	public List<com.example.demo.po.Categoryindex> getAll() {
		// TODO Auto-generated method stub
		return categoryindexMapper.selectByExample(null);
	}

	@Override
	public int add(com.example.demo.po.Categoryindex t) {
		// TODO Auto-generated method stub
		return categoryindexMapper.insertSelective(t);
	}

	@Override
	public int update(com.example.demo.po.Categoryindex t) {
		// TODO Auto-generated method stub
		return categoryindexMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return categoryindexMapper.deleteByPrimaryKey(id);
	}

	@Override
	public com.example.demo.po.Categoryindex getById(Integer id) {
		// TODO Auto-generated method stub
		return categoryindexMapper.selectByPrimaryKey(id);
	}

}
