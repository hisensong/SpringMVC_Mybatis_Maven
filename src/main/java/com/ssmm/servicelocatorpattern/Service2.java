package com.ssmm.servicelocatorpattern;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月26日 下午4:22:34
 */
public class Service2 implements ServiceCenter{
	
	@Override
	public String getName() {
		return "service2";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service2........");
	}
}
