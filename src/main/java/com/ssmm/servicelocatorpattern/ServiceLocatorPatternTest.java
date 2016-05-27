package com.ssmm.servicelocatorpattern;

/**
 * Description: 使用 ServiceLocator 来演示服务定位器设计模式。
 * Author: HisenSong
 * Datetime: 2016年5月27日 上午9:47:22
 */
public class ServiceLocatorPatternTest {
		
	public static void main(String[] args){
		ServiceCenter service1 = ServiceLocator.getService("service1");
		if(service1 != null){
			service1.execute();
		}
		
		ServiceCenter service2 = ServiceLocator.getService("service2");
		if(service2 != null){
			service2.execute();
		}
		
		ServiceCenter service3 = ServiceLocator.getService("service3");
		if(service3 != null){
			service3.execute();
		}
		
	}
	
	
}
