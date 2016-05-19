package com.ssmm.failstrategy;


/**
 * Description: fail over 策略实现---失败重试
 * Author: HisenSong
 * Datetime: 2016年5月19日 上午10:15:33
 */
public class FailoverTolerance extends AbstractFailTolerance{
	
	/**
	 * 失败后重试N次后，返回空
	 */
	@Override
	public <S, T, P> T invoke(S object, String methodName, P parameters) {
		int retries = super.retryTimes;
		for(int i=1;i<=retries;i++){
			try{
				return invoke(object, methodName, parameters);   
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("invoke failed for the" + i + "times");
			}
		}
		
		return null;
	}
	
	@Override
    public void setRetryTimes(int retryTimes) {
        super.setRetryTimes(retryTimes);
    }

}
