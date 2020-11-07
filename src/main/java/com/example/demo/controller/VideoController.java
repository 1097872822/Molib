 package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Manager;
import com.example.demo.po.Videos;
import com.example.demo.service.VideosService;

@Controller
@RequestMapping("/videos")
public class VideoController {
	@Autowired
	private VideosService videosService;
	@RequestMapping("/toAll")
	public String getAll(Model model) throws Exception{
		List<Videos> videos= videosService.getAll();
		model.addAttribute("videos", videos);
		return "videos/list";
	}
	@RequestMapping("/toedit")
	public String toEdit(Model model,Integer id) {
		Videos videoss = videosService.getById(id);
		model.addAttribute("Videoss", videoss);
		return "videos/edit";
	}
	@RequestMapping("/edit")
	public String edit(Videos videos) {
		Integer vid =videos.getvId();
		if(vid !=null) {
			videosService.update(videos);
			
		}else {
			videosService.add(videos);
			}
		
		return "redirect:toAll";
	}
	@RequestMapping("/delete")
	public String delete(Integer id) {
		if(id !=null&& id>0 ) {
			videosService.delete(id);
		}
		return "redirect:toAll";
	}
}
