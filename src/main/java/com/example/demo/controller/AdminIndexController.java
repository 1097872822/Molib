package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.MenuDTO;
import com.example.demo.service.MenuService;

@Controller
@RequestMapping("/admin")
public class AdminIndexController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/index")
	public String backStage(Model model) throws Exception {
		List<MenuDTO> menudto = menuService.getAllNavVm();
		model.addAttribute("menudto", menudto);
		return "bcamdin";
	}
	
}
