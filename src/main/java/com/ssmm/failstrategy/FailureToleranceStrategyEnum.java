package com.ssmm.failstrategy;

/**
 * Description: 失效策略枚举类
 * Author: HisenSong
 * Datetime: 2016年5月18日 下午4:56:47
 */
public enum FailureToleranceStrategyEnum {
	FAIL_OVER(2,"失败重试"),
	FAIL_FAST(4,"失败退出"),
	FAIL_SAFE(8,"失败忽略"),
	FAIL_BACK(16,"失败后处理");
	
	private int code;
	private String name;
	
	private FailureToleranceStrategyEnum(int code, String name) {
		this.code = code;
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
