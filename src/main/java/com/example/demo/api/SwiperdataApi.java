package com.example.demo.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResultModel;
import com.example.demo.po.Swiperdatas;
import com.example.demo.service.SwiperdatasService;
import com.example.demo.utils.ResultTools;

@RestController
@RequestMapping("/api/home")
@CrossOrigin
public class SwiperdataApi {

	@Autowired
	private SwiperdatasService swiperdatasService;

	// 查询全部
	@RequestMapping(value = { "/swiperdata" }, method = RequestMethod.GET)
	public ResultModel selectUserByAll() {
		try {
			List<Swiperdatas> swiperdata = swiperdatasService.getAll();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", swiperdata);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}
	
//	public List<Swiperdatas> all() {
//		return swiperdatasService.getAll();
//	}

	
}
