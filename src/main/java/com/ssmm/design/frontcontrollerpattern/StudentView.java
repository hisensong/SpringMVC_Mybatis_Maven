package com.ssmm.design.frontcontrollerpattern;

/**
 * Description:  视图是为请求而创建的对象
 * Author: HisenSong
 * Datetime: 2016年5月30日 下午4:55:33
 */
public class StudentView implements View{

	@Override
	public void show() {
		System.out.println("display student view.......");
	}

}
