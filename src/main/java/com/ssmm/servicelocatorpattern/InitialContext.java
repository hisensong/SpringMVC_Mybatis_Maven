package com.ssmm.servicelocatorpattern;

/**
 * Description: 为 JNDI 查询创建 InitialContext
 * Author: HisenSong
 * Datetime: 2016年5月26日 下午4:24:04
 */
public class InitialContext {
	
	public Object lookup(String jndiName){
		
		if(jndiName.equalsIgnoreCase("SERVICE1")){
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		}else if(jndiName.equalsIgnoreCase("SERVICE2")){
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		
		return null;
	} 
	
}
