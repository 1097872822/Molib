package com.example.demo.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface BaseService <T,ID extends Serializable> {
	
	// 查询所有
	public List<T> getAll();

	// 添加
	public int add(T t);

	// 修改
	public int update(T t);

	// 删除
	public int delete(ID id);
	// 根据ID查找
	public T getById(ID id);

}
