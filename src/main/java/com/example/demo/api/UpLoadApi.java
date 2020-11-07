package com.example.demo.api;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.demo.utils.RestResponse;
import com.example.demo.utils.TencentCOS;
import com.example.demo.utils.UploadImageResVM;

@RestController
@RequestMapping("/api/upload")
public class UpLoadApi {
	private static String secretId = "AKIDkeszwWIFSWVLUUzSO231seCj9RaTBgql";

	private static String secretKey = "76vVourZQ9pGSO4Uff06wWrxoOtCF2a9";

	private static final String bucketName = "wyl-1300435080";

	/**
	 * 使用fileInput插件进行文件上传
	 * 
	 * @param request  获取上传图片
	 * @param response
	 * @return 上传结果
	 * @throws UnsupportedEncodingException//编码异常
	 */
	@PostMapping("/uploadimage")
	public RestResponse<UploadImageResVM> uplodaImageOneWithFileInput(MultipartHttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
//		System.out.println(multipartFile.getContentType().substring(6));
		UploadImageResVM res = new UploadImageResVM();
		/** 页面控件的文件流* */
		request.setCharacterEncoding("UTF-8");
		MultipartHttpServletRequest multipartRequest = request;
		/** 页面控件的文件流* */
		MultipartFile multipartFile = null;
		Map map = multipartRequest.getFileMap();
		for (Iterator i = map.keySet().iterator(); i.hasNext();) {
			Object obj = i.next();
			multipartFile = (MultipartFile) map.get(obj);
		}
		if (multipartFile == null || multipartFile.isEmpty()) {
			res.setUploaded(0);
//			System.out.println(res);
			return RestResponse.fail(2, "上传失败");
		}
		String fileName = multipartFile.getOriginalFilename();
		// 获取文件后缀
		String prefix = fileName.substring(fileName.lastIndexOf("."));
		File excelFile = null;
		try {
			excelFile = File.createTempFile("imagesFile-" + System.currentTimeMillis(), prefix);
			multipartFile.transferTo(excelFile);
//			System.out.println(multipartFile.toString());
			fileName = TencentCOS.uploadfile(excelFile, secretId, secretKey, bucketName);
			// 访问路径
			String path = "https://" + bucketName + ".cos.ap-chengdu.myqcloud.com/" + fileName;
			res.setUploaded(1);
			res.setFileName(fileName);
			res.setUrl(path);
//			System.out.println(path);
			// 程序结束时，删除临时文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			res.setUploaded(0);
		}
		return RestResponse.ok(res);
	}

	@DeleteMapping("/delete")
	public RestResponse delete(@RequestParam("imageKey") String imageKey) {
		TencentCOS.deletefile(imageKey);
		return RestResponse.ok();
	}

}
