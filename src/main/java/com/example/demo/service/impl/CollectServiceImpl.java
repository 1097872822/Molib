package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CollectMapper;
import com.example.demo.po.Collect;
import com.example.demo.po.CollectExample;
import com.example.demo.po.CollectExample.Criteria;
import com.example.demo.service.CollectService;
@Service
public class CollectServiceImpl implements CollectService {
@Autowired 
private CollectMapper collectMapper;

@Override
public List<Collect> getAll() {
	// TODO Auto-generated method stub
	return collectMapper.selectByExample(null);
}

@Override
public int add(Collect t) {
	// TODO Auto-generated method stub
	return collectMapper.insertSelective(t);
}

@Override
public int update(Collect t) {
	// TODO Auto-generated method stub
	return collectMapper.updateByPrimaryKeySelective(t);
}

@Override
public int delete(Integer id) {
	// TODO Auto-generated method stub
	return collectMapper.deleteByPrimaryKey(id);
}

@Override
public Collect getById(Integer id) {
	// TODO Auto-generated method stub
	return collectMapper.selectByPrimaryKey(id);
}

@Override
public List<Collect> userCollect(Integer uid) {
	// TODO Auto-generated method stub
	CollectExample example=new CollectExample();
	Criteria criteria=example.createCriteria();
	criteria.andUIdEqualTo(uid);
	return collectMapper.selectByExample(example);
}


@Override
public Integer delectCollect(Integer uid, Integer bookid) {
	// TODO Auto-generated method stub
	CollectExample example = new CollectExample();
	Criteria criteria = example.createCriteria();
	criteria.andUIdEqualTo(uid);
	criteria.andBookIdEqualTo(bookid);
	return collectMapper.deleteByExample(example);
}

}
