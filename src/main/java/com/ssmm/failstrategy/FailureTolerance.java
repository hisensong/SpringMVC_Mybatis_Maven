package com.ssmm.failstrategy;

/**
 * Description: 失效策略
 * Author: HisenSong
 * Datetime: 2016年5月18日 下午6:23:00
 */
public interface FailureTolerance {
	
	public static final int DEFAULT_RETRY_TIMES = -1;
	
    public static final long DEFAULT_TIME_OUT = -1;
    
	<S,T,P> T invoke(S object,String methodName,P parameters);
	
	/**
	 * set retry times
	 * @param retryTimes
	 */
	void setRetryTimes(int retryTimes);
	
	/**
	 * set time out seconds
	 * @param timeout
	 */
	void setTimeout(long timeout);

}
