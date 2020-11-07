package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Clientuser;
import com.example.demo.service.ClientuserSerivce;


@Controller
@RequestMapping("/user")
public class ClientuserController {
	@Autowired
	private ClientuserSerivce clientuserSerivce;
	@RequestMapping("/client")
	public String getAll(Model model) throws Exception {
		List<Clientuser> clientusers =clientuserSerivce.getAll();
		model.addAttribute("clientusers", clientusers);
		return "clientuser/list";
	}
	
	// 添加用户信息
		@RequestMapping("/toedit")
		public String toeditclient(Model model, Integer id) {
			Clientuser clientuser = clientuserSerivce.getById(id);
			model.addAttribute("clientuser", clientuser);
			return "/clientuser/edit";
		}
		

		public static String getType(Object o) {
		// TODO Auto-generated method stub
		return o.getClass().toString();
	}

		// 修改
		@RequestMapping("/edit")
		public String edit(Clientuser clientuser) {

			Integer id = clientuser.getuId();
			Clientuser exit=clientuserSerivce.getById(id);
			
			if (exit!=null ) {
				clientuserSerivce.update(clientuser);
				
			} else {
				
				clientuserSerivce.add(clientuser);
			}

			return "redirect:client";
		}

		// 删除
		@RequestMapping("/delete")
		public String delete(Integer id) {

			if (id != null && id > 0) {
				clientuserSerivce.delete(id);
			}

			return "redirect:client";
		}


}
