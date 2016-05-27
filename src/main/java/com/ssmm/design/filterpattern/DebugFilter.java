package com.ssmm.design.filterpattern;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月27日 下午5:46:06
 */
public class DebugFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("DebugFilter request: " + request);
	}

}
