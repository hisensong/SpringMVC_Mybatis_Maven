package com.ssmm.failstrategy;

/**
 * Description: fail safe 策略实现---失败忽略
 * Author: HisenSong
 * Datetime: 2016年5月19日 上午10:30:13
 */
public class FailsafeTolerance extends AbstractFailTolerance{

	/**
	 * 失败后忽略调用异常
	 */
	@Override
	public <S, T, P> T invoke(S object, String methodName, P parameters) {
		try{
			return invoke(object, methodName, parameters);
		}catch(Exception e){
			e.printStackTrace();
			//忽略调用异常
		}
		
		return null;
	}

}
