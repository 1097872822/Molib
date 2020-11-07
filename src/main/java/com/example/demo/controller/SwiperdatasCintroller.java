package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Swiperdatas;
import com.example.demo.service.SwiperdatasService;

@Controller
@RequestMapping ("/swiperdata")
public class SwiperdatasCintroller {
	@Autowired private SwiperdatasService swiperdatasService;
	
	@RequestMapping ("/index")
	public String gatALL(Model model) {
		List<Swiperdatas> swiperdatas = swiperdatasService.getAll();
		model.addAttribute("swiperdatas", swiperdatas);
		return "swiper/list";
	}
	@RequestMapping ("/toedit")
	public String toEdit(Model model,Integer id) {
		Swiperdatas swiperdata = swiperdatasService.getById(id);
		model.addAttribute("swiperdata",swiperdata );
		return "swiper/edit";
	}
	@RequestMapping("/edit")
	public String edit(Swiperdatas swiperdata) {
		Integer id = swiperdata.getSwId();
		Swiperdatas data = swiperdatasService.getById(id);
		if (data !=null) {
			swiperdatasService.update(swiperdata);
		}else {
			swiperdatasService.add(swiperdata);
		}
		return "redirect:index";
	}
	@RequestMapping ("/delete")
	public String delete(Integer id) {
		swiperdatasService.delete(id);
		return "redirect:index";
	}

}
