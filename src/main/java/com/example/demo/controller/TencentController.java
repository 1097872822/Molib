package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TencentController {
	@RequestMapping("/upload")
	public String upload() {
		return "file/up";
		
}
	}
