package com.ssmm.servicelocatorpattern;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月26日 下午4:21:16
 */
public class Service1 implements ServiceCenter{

	@Override
	public String getName() {
		return "service1";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service1........");
	}

}
