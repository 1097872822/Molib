package com.example.demo.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.po.Msg;
@Service
public interface BaseMsgService <T,ID extends Serializable> {
	
	/**
	 * 通用增加方法
	 * @param <ID> 泛型参数
	 * * @param id
	 * @return Msg 消息对象
	 */
	public  Msg add(T t)throws Exception;
	
	/**
	 * 通用删除方法
	 * @param <ID> 泛型参数
	 * @param id
	 * @return Msg 消息对象
	 */
	public  Msg delete(ID id)throws Exception;
	
	/**
	 * 通用修改方法
	 * @param <ID> 泛型参数
	 * @param id
	 * @return Msg 消息对象
	 */
	public  Msg update(T t)throws Exception;
	
	/**
	 * 通用查询方法(有参)
	 * @param <ID>泛型参数
	 * @param id
	 * @return T 返回的泛型对象
	 */
	public  T findOne(ID id)throws Exception;
	
	/**
	 * 通用查询方法(查询所有)
	 * @param <ID>泛型参数
	 * @param id
	 * @return T 返回的泛型对象
	 */
	public  List<T> findAll()throws Exception;
}
