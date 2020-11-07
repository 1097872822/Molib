package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.po.Collect;
@Service
public interface CollectService extends BaseService<Collect, Integer>{
	List<Collect> userCollect(Integer uid) ;
	Integer delectCollect(Integer uid,Integer bookid);
}
