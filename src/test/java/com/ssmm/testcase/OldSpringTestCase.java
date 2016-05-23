package com.ssmm.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssmm.model.User;
import com.ssmm.service.UserService;

/**
 * Description:  Junit4 框架测试 
 * 特点：
 * 1.在测试开始之前，需要手工加载 Spring 的配置文件，并获取需要的 bean 实例
 * 2.在测试结束的时候，需要手工清空搭建的数据库环境，比如清除您插入或者更新的数据，以保证对下一个测试没有影响
 * 3.还不能使用 Spring 的依赖注入特性。一切都靠手工编码实现还不能使用 Spring 的依赖注入特性。一切都靠手工编码实现
 * Author: HisenSong
 * Datetime: 2016年5月23日 下午2:06:51
 */
public class OldSpringTestCase {
	private static ClassPathXmlApplicationContext context;	
	private static UserService  userService;
	
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
	
	
	@Test
	public void addUserTest(){
		User user = new User();
		user.setAge(67);
		user.setUsername("美易分");
		user.setPassword("zxcvbnm098");
	
		userService.saveUser(user);
		System.out.println("添加成功~");
		
	}
}
