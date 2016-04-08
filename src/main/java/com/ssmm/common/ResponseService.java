package com.ssmm.common;

public class ResponseService<T> {
	
	private T data;
	private String code;
	private String msg;
	
	public void success(T data){
		this.data = data;
		this.code = "000";
		this.msg = "³É¹¦";
	}
	
	public void fail(T data){
		this.data = data;
		this.code = "001";
		this.msg = "Ê§°Ü";
	}
	
	
	public T getT() {
		return data;
	}
	public void setT(T t) {
		this.data = t;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
