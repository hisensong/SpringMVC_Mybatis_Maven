package com.ssmm.design.filterpattern;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月27日 下午5:58:20
 */
public class FilterManager {

	 FilterChain filterChain;
	
	 public FilterManager(Target target){
		 filterChain = new FilterChain();
		 filterChain.setTarget(target);
	 }
	 
	 public void setFilter(Filter filter){
		 filterChain.addFilter(filter);
	 }
	 
	 public void filterRequest(String request){
	      filterChain.execute(request);
	 }
	
}
