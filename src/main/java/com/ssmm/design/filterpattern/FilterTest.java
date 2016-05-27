package com.ssmm.design.filterpattern;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月27日 下午6:04:38
 */
public class FilterTest {
	
	public static void main(String[] args){
		
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthFilter());
		filterManager.setFilter(new DebugFilter());
		
		Client client = new Client(filterManager);
		
		client.sendRequest("hello world");
	}

}
