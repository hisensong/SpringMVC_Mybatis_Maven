package com.ssmm.design;

import org.junit.Test;

import com.ssmm.design.jdkproxy.MyInvocationHandler;
import com.ssmm.design.jdkproxy.UserServiceImpl;
import com.ssmm.design.jdkproxy.UserService;

/**
 * Description: JDK动态代理测试
 * Author: HisenSong
 * Datetime: 2016年5月25日 下午5:32:29
 */
public class JDKProxyTest {
	
	@Test
	public void testProxy(){
		//1.实例化目标对象  
        UserService userService = new UserServiceImpl();  
		//2.实例化InvocationHandler
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        //3.根据目标对象生成代理对象
        UserService  proxy = (UserService)invocationHandler.getProxy();
        //4.调用代理对象的方法
        proxy.add();
        
        
	}
	
}
