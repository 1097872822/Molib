package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Books;
import com.example.demo.po.Categoryindex;
import com.example.demo.service.BooksService;
import com.example.demo.service.CategoryindexService;

@Controller
@RequestMapping("/books")
public class BooksController {
	@Autowired 
	private BooksService booksService;
	@Autowired
	private CategoryindexService categoryserice;
	@RequestMapping("/index")
	public String getAll(Model model ,String name) {
		List<Books> books= null;
		if(name !=null) {
			books = booksService.queryNavName(name);
		}else {
			books=booksService.getAll();
//			books= booksService.getBooksList(bookslist);
		}
		model.addAttribute("books", books);
		return "books/list";
	}
	@RequestMapping("/toedit")
	public String toEdit(Model model,Integer id) {
		Books book = booksService.getById(id);
		List<Categoryindex> categoryindex = categoryserice.getAll();
		model.addAttribute("book", book);
		model.addAttribute("categoryindex", categoryindex);
		return "books/edit";
	}
	@RequestMapping("/edit")
	public String edit(Books books) {
		Integer id =books.getBookId();
		Books book =booksService.getById(id);
		if (book !=null) {
			booksService.update(books);
		}
		else {
			books.setAddTime(new Date());
			booksService.add(books);
		}
		return "redirect:index";
	}
	@RequestMapping ("/delete")
	public String delete(Integer id) {
		if(id!=null&&id>0) {
			booksService.delete(id);
		}
		return "redirect:index";
	}

}
