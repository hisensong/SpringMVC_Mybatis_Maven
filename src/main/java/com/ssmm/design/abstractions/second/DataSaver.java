package com.ssmm.design.abstractions.second;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月13日 下午4:03:46
 */
public interface DataSaver<T> {
	boolean saveDate(T obj);
}
