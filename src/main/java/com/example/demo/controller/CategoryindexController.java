package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Categoryindex;
import com.example.demo.service.CategoryindexService;

@Controller
@RequestMapping("/category")
public class CategoryindexController {
	@Autowired 
	private CategoryindexService categoryindexService;
	@RequestMapping("/index")
	public String getAll(Model model) {
		List<Categoryindex> categoryindexs = categoryindexService.getAll();
		model.addAttribute("categoryindexs", categoryindexs);
		
	return "category/list";
	}

	@RequestMapping("/toedit")
	public String toEdit(Model model ,Integer id) {
		Categoryindex categoryindex = categoryindexService.getById(id);
		model.addAttribute("categoryindex", categoryindex);
		return "category/edit";
	}

	@RequestMapping("/edit")
	public String edit(Categoryindex categoryindex) {
		Integer id = categoryindex.getCaId();
		Categoryindex ca=categoryindexService.getById(id);
		if(ca !=null) {
			categoryindexService.update(categoryindex);
		}else {
			categoryindexService.add(categoryindex);
		}
		return "redirect:index";
		
	}
	

	@RequestMapping("/delete")
	public String delete(Integer id) {

		if (id != null && id > 0) {
			categoryindexService.delete(id);
		}

		return "redirect:index";
	}
	
}
