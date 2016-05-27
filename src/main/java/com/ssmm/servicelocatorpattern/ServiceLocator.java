package com.ssmm.servicelocatorpattern;

/**
 * Description: 服务定位器
 * Author: HisenSong
 * Datetime: 2016年5月26日 下午4:49:54
 */
public class ServiceLocator {
	
	private static Cache cache;
	
	static{
		cache = new Cache();
	}
	
	public static ServiceCenter getService(String jndiName){
		ServiceCenter service = cache.getService(jndiName);
		if(service != null){
			return service;
		}
		
		InitialContext context = new InitialContext();
		ServiceCenter service2 = (ServiceCenter)context.lookup(jndiName);
		cache.addService(service2);
		
		return service2;
		
	}

}
