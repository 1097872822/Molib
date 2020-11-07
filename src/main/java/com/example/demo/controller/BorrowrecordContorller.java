package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Borrowrecord;
import com.example.demo.service.BorrowrecordService;

@Controller
@RequestMapping("/borrowrecord")
public class BorrowrecordContorller {
@Autowired BorrowrecordService borrowrecordService;
@RequestMapping("/index")
public String getAll(Model model) {
	List<Borrowrecord> borrowrecords =borrowrecordService.getAll();
	model.addAttribute("borrowrecords", borrowrecords);
	return "borrowAll/list";
}
}
