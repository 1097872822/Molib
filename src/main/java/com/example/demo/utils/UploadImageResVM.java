package com.example.demo.utils;

import lombok.Data;

@Data
public class UploadImageResVM {

	/**
	 * 1成功，0失败
	 */
	private Integer uploaded;

	private String fileName;

	private String url;

}
