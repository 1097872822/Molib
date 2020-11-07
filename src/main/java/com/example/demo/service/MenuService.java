package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.po.Menu;
import com.example.demo.po.MenuDTO;

@Service
public interface MenuService  extends BaseService<Menu, Integer> {

	public List<MenuDTO> getAllNavVm();

	public List<Menu> getMenuByPid(Integer pid);

}

