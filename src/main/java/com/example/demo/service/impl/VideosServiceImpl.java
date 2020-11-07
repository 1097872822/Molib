package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.VideosMapper;
import com.example.demo.po.Videos;
import com.example.demo.service.VideosService;
@Service
public class VideosServiceImpl implements VideosService {
@Autowired private VideosMapper videosMapper;
	@Override
	public List<Videos> getAll() {
		// TODO Auto-generated method stub
		return videosMapper.selectByExample(null);
	}

	@Override
	public int add(Videos t) {
		// TODO Auto-generated method stub
		return videosMapper.insertSelective(t);
	}

	@Override
	public int update(Videos t) {
		// TODO Auto-generated method stub
		return videosMapper.updateByPrimaryKey(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return videosMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Videos getById(Integer id) {
		// TODO Auto-generated method stub
		return videosMapper.selectByPrimaryKey(id);
	}

}
