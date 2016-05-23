package com.ssmm.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ssmm.model.User;
import com.ssmm.service.UserService;

/**
 * Description: Spring test 框架进行的单元测试
 * @RunWith 注释标签是 Junit 提供的，用来说明此测试类的运行者，这里用了 SpringJUnit4ClassRunner，
 * 			这个类是一个针对 Junit 运行环境的自定义扩展，用来标准化在 Spring 环境中 Junit4.5 的测试用例，
 * 			例如支持的注释标签的标准化
 * @ContextConfiguration 注释标签是 Spring test context 提供的，用来指定 Spring 配置信息的来源，
 * 		         支持指定 XML 文件位置或者 Spring 配置类名，这里我们指定 classpath 下的 /config/Spring-db1.xml 
 * 			为配置文件的位置
 * @Transactional 注释标签是表明此测试类的事务启用，这样所有的测试方案都会自动的 rollback，
 * 			即您不用自己清除自己所做的任何对数据库的变更了
 * @Autowired 体现了我们的测试类也是在 Spring 的容器中管理的，他可以获取容器的 bean 的注入，
 * 			您不用自己手工获取要测试的 bean 实例了
 * 
 * 特点：
 * 1.手工加载 Spring 的配置文件
 * 2.手工清理数据库的每次变更
 * 3.手工获取 application context 然后获取 bean 实例
 * 
 * Author: HisenSong
 * Datetime: 2016年5月23日 下午1:58:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/*.xml")
public class NewSpringTestCase {
	
	@Autowired
	private  UserService  userService;
	
	@Test
	public void addUserTest(){
		User user = new User();
		user.setAge(36);
		user.setUsername("国美金控1");
		user.setPassword("poiuy567");
	
		userService.saveUser(user);
		System.out.println("添加成功~");
		
	}
	

}
