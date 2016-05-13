package com.ssmm.design.abstractions.second;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月13日 下午4:02:17
 */
public interface Converter<S,T> {
	T convert(S source);
}
