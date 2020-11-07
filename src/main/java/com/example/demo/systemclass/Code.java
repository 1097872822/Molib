package com.example.demo.systemclass;
public enum Code {
	FAIL("失败",0),
	SUCCESS("成功",1),
	EXCEPTION("服务器异常",2),
	CHEK_EXCEPTION("参数校验异常",3),
	USER_CANUSE("用户名可用",1001),
	USER_EXSIST("用户名已存在",1002),
	Email_CANUSE("邮箱可用",2001),
	Email_EXSIST("邮箱已注册",2002);
	private final String msg ;
    private final int code;
	private Code(String msg, int code) {
		this.msg = msg;
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public int getCode() {
		return code;
	}
	
}
