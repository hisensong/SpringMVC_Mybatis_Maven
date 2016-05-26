package com.ssmm.design.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * Description: 该类实现了创建子类的方法与代理的方法
 * Author: HisenSong
 * Datetime: 2016年5月25日 下午6:59:42
 */
public class CglibProxy implements MethodInterceptor{
	
	private Enhancer enhancer = new Enhancer(); 
	
	public Object getProxy(Class clazz){
	  //设置需要创建子类的类  
	  enhancer.setSuperclass(clazz);  
	  enhancer.setCallback(this);  
	  //通过字节码技术动态创建子类实例  
	  return enhancer.create();  
	}
	
	/**
	 * 实现MethodInterceptor接口方法  
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("前置代理");
		Object result = proxy.invokeSuper(obj, args);
		System.out.println("后置代理");  
		return null;
	}

}
