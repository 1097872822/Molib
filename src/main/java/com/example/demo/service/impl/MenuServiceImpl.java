package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MenuMapper;
import com.example.demo.po.Menu;
import com.example.demo.po.MenuDTO;
import com.example.demo.po.MenuExample;
import com.example.demo.po.MenuExample.Criteria;
import com.example.demo.po.Msg;
import com.example.demo.service.MenuService;
import com.example.demo.systemclass.Code;
@Service
public class MenuServiceImpl implements MenuService{
	@Autowired 
	private MenuMapper menuMapper;

	@Override
	public List<Menu> getAll() {
		// TODO Auto-generated method stub
		return menuMapper.selectByExample(null);
	}

	@Override
	public int add(Menu t) {
		// TODO Auto-generated method stub
		menuMapper.insertSelective(t);
		return 1;
	}

	@Override
	public int update(Menu t) {
		// TODO Auto-generated method stub
		menuMapper.updateByPrimaryKeySelective(t);
		return 1;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		menuMapper.deleteByPrimaryKey(id);
		return 1;
	}

	@Override
	public Menu getById(Integer id) {
		// TODO Auto-generated method stub
		return menuMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<MenuDTO> getAllNavVm() {
		// TODO Auto-generated method stub
		List<Menu> firstMenu = getMenuByPid(0);
		List<MenuDTO> dtos = new ArrayList<MenuDTO>();
		for (Menu menu:firstMenu) {
			MenuDTO dto = new MenuDTO();
			List<Menu> childrens = getMenuByPid(menu.getId());
			BeanUtils.copyProperties(menu, dto);
			dto.setChildren(childrens);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public List<Menu> getMenuByPid(Integer pid) {
		// TODO Auto-generated method stub
		MenuExample example = new MenuExample();
		Criteria criteria = example.createCriteria();
		criteria.andMenupidEqualTo(pid);
		return menuMapper.selectByExample(example);
	}
	
	

}
