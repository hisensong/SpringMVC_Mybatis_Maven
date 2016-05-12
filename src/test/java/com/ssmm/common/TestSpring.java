package com.ssmm.common;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssmm.model.User;
import com.ssmm.service.UserService;

public class TestSpring {
	private static ClassPathXmlApplicationContext context;
	
	@Autowired
	private UserService userService;
	
	@Before
	public void setUp(){
		String[] xmls = new String[]{"classpath:spring/*.xml"};
		context = new ClassPathXmlApplicationContext(xmls);
	}
	
	@After
	public void tearDown(){
		 if (context != null) {
	            context.destroy();
	     }
	}
	
	@Test
	public void testUser(){
		System.out.println("====11111111111=======");
		User user = userService.getUserById(4);
		System.out.println("=====222222222======");
	}
	

}
