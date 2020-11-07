package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.SwiperdatasMapper;
import com.example.demo.po.Swiperdatas;
import com.example.demo.service.SwiperdatasService;
@Service
public class SwiperdatasServiceImpl implements SwiperdatasService {

	@Autowired private SwiperdatasMapper swiperdatasMapper;
	@Override
	public List<Swiperdatas> getAll() {
		// TODO Auto-generated method stub
		return swiperdatasMapper.selectByExample(null);
	}

	@Override
	public int add(Swiperdatas t) {
		// TODO Auto-generated method stub
		return swiperdatasMapper.insertSelective(t);
	}

	@Override
	public int update(Swiperdatas t) {
		// TODO Auto-generated method stub
		return swiperdatasMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return swiperdatasMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Swiperdatas getById(Integer id) {
		// TODO Auto-generated method stub
		return swiperdatasMapper.selectByPrimaryKey(id);
	}

}
