package com.ssmm.design.frontcontrollerpattern;

/**
 * Description:调度器 
 * Author: HisenSong
 * Datetime: 2016年5月30日 下午4:52:28
 */
public class Dispatcher {
	
	private StudentView studentView;
	private HomeView homeView;
	
	public  Dispatcher(){
		studentView = new StudentView();
		homeView = new HomeView();
	}
	
	public void dispatch(String request){
		if("student".equalsIgnoreCase(request)){
			studentView.show();
		}else if("home".equalsIgnoreCase(request)){
			homeView.show();
		}
		
	}
}
