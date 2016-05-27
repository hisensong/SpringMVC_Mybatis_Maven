package com.ssmm.design.filterpattern;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月27日 下午6:02:37
 */
public class Client {
	
	FilterManager filterManager;

	public Client(FilterManager filterManager) {
		super();
		this.filterManager = filterManager;
	}

	public void sendRequest(String request){
	      filterManager.filterRequest(request);
	}
	
}
