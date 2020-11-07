package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Menu;
import com.example.demo.po.MenuDTO;
import com.example.demo.po.Msg;
import com.example.demo.service.MenuService;


@Controller
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuService menuService;
//
//	// 跳到菜单列表
//	@RequestMapping("/list")
//	public String toMenuList(ModelMap modelMap) throws Exception {
//		List<MenuDTO> menus = null;
//		menus = menuService.getAllMenuDTO();
//		modelMap.addAttribute("menus", menus);
//		return "/menu/list";
//	}
//	// 跳到菜单编辑
//		@RequestMapping("/toedit")
//		public String toMenuEdit(ModelMap modelMap, Integer id, String menuName, Integer menuPid) throws Exception {
//			if (id != null && id > 0) {
//				Menu menu = menuService.findOne(id);
//				List<Menu> menus = menuService.getAllOneLevelMenu();
//				if (menu.getMenupid() != 0) {
//					Menu fatherMenu = menuService.getMenuByPid(menu.getMenupid());
//					modelMap.addAttribute("fatherMenu", fatherMenu);
//				}
//				modelMap.addAttribute("menus", menus);
//				modelMap.addAttribute("menu", menu);
//
//			}
//			if (menuPid != null && menuPid > 0) {
//				Menu menu = new Menu();
//				menu.setMenupid(menuPid);
//				modelMap.addAttribute("menu", menu);
//			}
//			return "/menu/edit";
//		}
//
//		// 菜单修改
//		@RequestMapping("/edit")
//		public String menuedit(ModelMap modelMap, Menu menu) throws Exception {
//			/*
//			 * if(menu.getVisible()==null) { menu.setVisible(false); }else {
//			 * menu.setVisible(true); }
//			 */
//			Integer id = menu.getId();// 判断这个流程是添加流程还是更新流程
//
//			if (id != null && id > 0) {
//				@SuppressWarnings("unused")
//				Msg msg = menuService.update(menu);
//			} else {
//				@SuppressWarnings("unused")
//				Msg msg = menuService.add(menu);
//			}
//			/* Msg msg = menuService.update(menu); */
//			return "redirect:list";
//		}
//
//		// 删除一条菜单
//		@RequestMapping("/delete")
//		public String deleteMenu(Integer id) throws Exception {
//			@SuppressWarnings("unused")
//			Msg msg = menuService.delete(id);
//			return "redirect:list";
//		}

}
