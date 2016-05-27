package com.ssmm.design.cglibproxy;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月27日 上午10:10:08
 */
public class TestCglibProxy {
	
	public static void main(String[] args){
		CglibProxy  proxy = new CglibProxy();
		
		//通过生成子类的方式创建代理类  
		SayHello proxyObj =  (SayHello)proxy.getProxy(SayHello.class);
		proxyObj.say1();	
	}

}
