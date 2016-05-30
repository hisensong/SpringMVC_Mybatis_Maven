package com.ssmm.design.frontcontrollerpattern;

/**
 * Description:  处理应用程序所有类型请求的单个处理程序，应用程序可以是基于 web 的应用程序，也可以是基于桌面的应用程序。
 * Author: HisenSong
 * Datetime: 2016年5月30日 下午5:05:44
 */
public class FrontController {
	private Dispatcher dispatcher;
	
	public FrontController(){
		dispatcher = new Dispatcher();
	}
	
	public void dispatchRequest(String request){
		//记录每一个请求
		trackRequest(request);
		//对用户进行身份认证
		if(isAuthenticUser()){
			dispatcher.dispatch(request);
		}
		
	}
	
	/**
	 * 记录请求
	 */
	private void trackRequest(String request){
		System.out.println("page request:"+request);
	}
	
	private boolean isAuthenticUser(){
		System.out.println("User is authenticated successfully.");
		return true;
	}
}
