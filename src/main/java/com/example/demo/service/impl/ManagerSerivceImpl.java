package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ManagerMapper;
import com.example.demo.po.Manager;
import com.example.demo.service.ManagerSerivce;
@Service
public class ManagerSerivceImpl implements ManagerSerivce {
	@Autowired private ManagerMapper managerMapper;
	@Override
	public List<Manager> getAll() {
		// TODO Auto-generated method stub
		return managerMapper.selectByExample(null);
	}

	@Override
	public int add(Manager t) {
		// TODO Auto-generated method stub
		return managerMapper.insertSelective(t);
	}

	@Override
	public int update(Manager t) {
		// TODO Auto-generated method stub
		return managerMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return managerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Manager getById(Integer id) {
		// TODO Auto-generated method stub
		return managerMapper.selectByPrimaryKey(id);
	}

}
