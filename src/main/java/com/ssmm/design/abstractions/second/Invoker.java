package com.ssmm.design.abstractions.second;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月13日 上午10:41:40
 */
public interface Invoker<S,T> {
	T invoke(S bean);
}
