package com.ssmm.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssmm.model.User;
import com.ssmm.service.UserService;

/**
 * Description: 事务测试用例
 * Author: HisenSong
 * Datetime: 2016年5月23日 上午10:52:37
 */
public class TransactionTest {
	ClassPathXmlApplicationContext context;
	
	UserService  userService;
	
	@Before
	public void setUp(){
		String[] xmls = new String[]{"classpath:spring/*.xml"};
		context = new ClassPathXmlApplicationContext(xmls);
		userService = (UserService)context.getBean("userService");
	}
	
	@After
	public void tearDown(){
		if(context != null){
			context.close();
		}
	}
	
	/**
	 * 测试事务
	 */
	@Test
	public void addUserTest(){
		User user = new User();
		user.setAge(26);
		user.setUsername("zhangsan");
		user.setPassword("qwerty123");
	
		userService.addUser(user);
		System.out.println("添加成功~");
		
	}
	
	
	
}
