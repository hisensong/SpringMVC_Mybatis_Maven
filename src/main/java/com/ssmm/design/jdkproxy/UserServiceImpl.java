package com.ssmm.design.jdkproxy;

/**
 * Description: 目标对象 
 * Author: HisenSong
 * Datetime: 2016年5月25日 下午5:29:20
 */
public class UserServiceImpl implements UserService{

	@Override
	public void add() {
		System.out.println("--------------------add---------------");  
	}

}
