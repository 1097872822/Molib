package com.example.demo.viewModel;

import lombok.Data;

@Data
public class BookResponseVM {
	private int id;
	private String bookName;
	private String bookImg;
	private String bookAuthor;
	private String bookBrief;
	private String bookPress;
	private Integer collectNumber;
	private Integer borrowNumber;
}
