package com.ssmm.failstrategy;

/**
 * Description: fail fast 策略实现----失败退出
 * Author: HisenSong
 * Datetime: 2016年5月18日 下午6:48:57
 */
public class FailfastTolerance extends AbstractFailTolerance{

	/**
	 * 调用失败后扔出异常
	 */
	@Override
	public <S, T, P> T invoke(S object, String methodName, P parameters) {
		try{
			return invokeMethod(object, methodName, parameters);
		}catch(Exception e){
			 throw new RuntimeException(e.getMessage(), e);
		}
		
	}

}
