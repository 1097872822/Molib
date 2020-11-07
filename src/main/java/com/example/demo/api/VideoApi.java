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
import com.example.demo.po.Videos;
import com.example.demo.service.VideosService;
import com.example.demo.utils.ResultTools;

@RestController
@RequestMapping("/api/videos")
@CrossOrigin
public class VideoApi {
	@Autowired private VideosService videosService;
	// 查询全部
		@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
		public ResultModel selectVideoByAll() {
			try {
				List<Videos> videos = videosService.getAll();
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", videos);
				return ResultTools.result(0, "", map);
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}
		}
		// 查询部分
				@RequestMapping(value = { "/delia" }, method = RequestMethod.GET)
				public ResultModel selectVideoBy(Integer id) {
					try {
						Videos video = videosService.getById(id);
						Map<String, Object> map = new HashMap<String, Object>();
						map.put("content", video);
						return ResultTools.result(0, "", map);
					} catch (Exception e) {
						return ResultTools.result(404, e.getMessage(), null);
					}
				}

}
