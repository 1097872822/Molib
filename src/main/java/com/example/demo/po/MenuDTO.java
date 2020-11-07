package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class MenuDTO extends Menu {

	private List<Menu> children;

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

}
