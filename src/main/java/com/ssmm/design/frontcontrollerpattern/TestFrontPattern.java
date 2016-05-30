package com.ssmm.design.frontcontrollerpattern;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月30日 下午5:13:20
 */
public class TestFrontPattern {
	
	public static void main(String[] args){
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("home");
		frontController.dispatchRequest("STUDENT");
		
	}
}
