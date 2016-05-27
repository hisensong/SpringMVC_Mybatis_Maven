package com.ssmm.design.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月27日 下午5:49:32
 */
public class FilterChain {
	private List<Filter> filters = new ArrayList<>();
	private Target target;
	
	public void addFilter(Filter filter){
		filters.add(filter);
	}
	
	public void execute(String request){
		for(Filter f:filters){
			f.execute(request);
		}
		
		target.execute(request);
	}
	
	public void setTarget(Target target){
	      this.target = target;
	}
	
}
