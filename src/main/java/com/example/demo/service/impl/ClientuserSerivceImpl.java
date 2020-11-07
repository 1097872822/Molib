package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ClientuserMapper;
import com.example.demo.po.Clientuser;
import com.example.demo.po.ClientuserExample;
import com.example.demo.po.ClientuserExample.Criteria;
import com.example.demo.service.ClientuserSerivce;
@Service
public class ClientuserSerivceImpl implements ClientuserSerivce {
	@Autowired
		private ClientuserMapper cuserMapper;
	@Override
	public List<Clientuser> getAll() {
		// TODO Auto-generated method stub
		return cuserMapper.selectByExample(null);
	}

	@Override
	public int add(Clientuser t) {
		// TODO Auto-generated method stub
		return cuserMapper.insertSelective(t);
	}

	@Override
	public int update(Clientuser t) {
		// TODO Auto-generated method stub
		return cuserMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return cuserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Clientuser getById(Integer id) {
		// TODO Auto-generated method stub
		return cuserMapper.selectByPrimaryKey(id);
	}
	@Override
	public Clientuser clientNo(Integer userno) {
		// TODO Auto-generated method stub
		return cuserMapper.selectByUserno(userno);
		
	}

	@Override
	public List<Clientuser> selectByLimit() {
		// TODO Auto-generated method stub
		return cuserMapper.selectByLimit(null);
	}
	
}
