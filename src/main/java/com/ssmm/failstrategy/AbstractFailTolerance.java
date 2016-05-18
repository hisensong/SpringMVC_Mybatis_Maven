package com.ssmm.failstrategy;

import java.lang.reflect.Method;

/**
 * Description: 失效策略抽象实现类
 * Author: HisenSong
 * Datetime: 2016年5月18日 下午6:31:18
 */
public abstract  class AbstractFailTolerance implements FailureTolerance{
	protected int retryTimes = DEFAULT_RETRY_TIMES;
	protected long timeout = DEFAULT_TIME_OUT;
		
	@Override
	public void setRetryTimes(int retryTimes) {
		this.retryTimes = retryTimes;
	}

	@Override
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
	
	/**
	 * 调用对象方法
	 * @param object 对象
	 * @param methodName 方法名
	 * @param parameters 方法参数值
	 * @param <S> 对象类型
     * @param <T> 值类型
     * @param <P> 参数
	 * @return
	 * @throws Exception 
	 */
	protected <S,T,P> T invokeMethod(S object, String methodName, P parameters) throws Exception{
		
		try {
			Method method = Class.forName(object.getClass().getName()).getDeclaredMethod(methodName, parameters.getClass());
			method.setAccessible(true);
			return (T)method.invoke(object, parameters);
		} catch (Exception e) {
			throw e;
		} 
		
	}

}
