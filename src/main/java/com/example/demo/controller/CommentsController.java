package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Comments;
import com.example.demo.service.CommentsService;

@Controller
@RequestMapping("/comment")
public class CommentsController {
@Autowired 
private CommentsService commentsService;

@RequestMapping("/index")
public String getAll(Model model) throws Exception{
	List<Comments> comments= commentsService.getAll();
	model.addAttribute("comments", comments);
	return "comments/list";
}
}
