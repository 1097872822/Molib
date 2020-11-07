package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.po.Clientuser;
@Service
public interface ClientuserSerivce extends BaseService<Clientuser, Integer> {
	Clientuser clientNo(Integer userno);
	List<Clientuser>selectByLimit();
	

}
