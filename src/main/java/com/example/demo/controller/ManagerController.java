package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Manager;
import com.example.demo.service.ManagerSerivce;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	@Autowired 
	private ManagerSerivce managerSerivce;
	@RequestMapping("/toAll")
	public String getAll(Model model) throws Exception{
		List<Manager> managers= managerSerivce.getAll();
		model.addAttribute("managers", managers);
		return "managers/list";
	}
	@RequestMapping("/toedit")
	public String toEdit(Model model,Integer id) {
		Manager managerss = managerSerivce.getById(id);
		model.addAttribute("managerss", managerss);
		return "managers/edit";
	}
	@RequestMapping("/edit")
	public String edit(Manager manager) {
		Integer mid =manager.getmId();
		if(mid !=null) {
			managerSerivce.update(manager);
			
		}else {
			managerSerivce.add(manager);
			}
		
		return "redirect:toAll";
	}
	@RequestMapping("/delete")
	public String delete(Integer id) {
		if(id !=null&& id>0 ) {
		managerSerivce.delete(id);
		}
		return "redirect:toAll";
	}
}
