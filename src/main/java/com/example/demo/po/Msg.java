package com.example.demo.po;

import com.example.demo.systemclass.Code;

public class Msg {
	private static int code=Code.FAIL.getCode();
	private static String msg=Code.FAIL.getMsg();
	private static String jsonData;
	public  int getCode() {
		return code;
	}
	public void setCode(int code) {
		Msg.code = code;
	}
	public  String getMsg() {
		return msg;
	}
	public  void setMsg(String msg) {
		Msg.msg = msg;
	}
	public  String getJsonData() {
		return jsonData;
	}
	public  void setJsonData(String jsonData) {
		Msg.jsonData = jsonData;
	}
}
