package com.ssmm.design.filterpattern;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月27日 下午5:42:47
 */
public class AuthFilter implements Filter{
	
	@Override
	public void execute(String request) {
		System.out.println("AuthFilter request:"+request);
	}

}
