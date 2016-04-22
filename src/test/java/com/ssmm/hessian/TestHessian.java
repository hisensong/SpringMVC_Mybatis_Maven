package com.ssmm.hessian;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caucho.hessian.client.HessianProxyFactory;
import com.ssmm.api.ISayHelloService;

public class TestHessian {

	public static void main(String[] args) {  
        ISayHelloService sayHelloService = getBean(ISayHelloService.class, "sayHelloService");  
        System.out.println(sayHelloService.doSayHello("王五"));  
        //客户端必须启用重载方法支持  不然会抛出Caused by: com.caucho.hessian.io.HessianProtocolException: '�' is an unknown code异常  
        System.out.println(sayHelloService.doSayHello("李四", "welcome"));  
    }  
      
    public static <T> T getBean(Class<T> clazs, String beanName) {  
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-hessianClient.xml");  
        return clazs.cast(applicationContext.getBean(beanName));  
    }  
  
	
}
