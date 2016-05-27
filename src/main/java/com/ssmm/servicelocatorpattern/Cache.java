package com.ssmm.servicelocatorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 创建缓存 Cache。
 * Author: HisenSong
 * Datetime: 2016年5月26日 下午4:39:40
 */
public class Cache {

	private List<ServiceCenter> services;
	
	public Cache(){
		services = new ArrayList<>();
	}
	
	/**
	 * 获取单个服务
	 * @param serviceName
	 * @return
	 */
	public ServiceCenter getService(String serviceName){
		for(ServiceCenter service:services){
			if(service.getName().equalsIgnoreCase(serviceName)){
				System.out.println("Returning cached  "+serviceName+" object");
				return service;
			}
		}
		
		return null;
	}
	
	/**
	 * 添加缓存服务
	 * @param newService
	 */
	public void addService(ServiceCenter newService){
		boolean exists = false;
		for(ServiceCenter service:services){
			if(service.getName().equalsIgnoreCase(newService.getName())){
				exists = true;
			}
		}
		
		if(exists){
			services.add(newService);
		}
	}
	
	
}
