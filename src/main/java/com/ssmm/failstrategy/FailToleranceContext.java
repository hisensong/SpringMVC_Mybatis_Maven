package com.ssmm.failstrategy;

/**
 * Description: 失效调用上下文类
 * Author: HisenSong
 * Datetime: 2016年5月19日 上午10:35:43
 */

/**
 * 失效调用上下文类，调用示例代码：
 * <pre>
 *     FailureTolerance failover = FailureToleranceFactory.getFailureTolenrance(FailureToleranceStrategyEnum.FAIL_OVER);
 *     Assert.assertNull(FailToleranceContext.getInstance(failover).invoke(pycreditClient, "queryOriginReport", queryInfo));
 * </pre>
 */
public class FailToleranceContext {
	
	private FailureTolerance ft;
	private FailToleranceContext(){}
	
	public static FailToleranceContext getInstance(){
		return new FailToleranceContext();
	}
	
	public static FailToleranceContext getInstance(FailureTolerance ft){
		FailToleranceContext context = new FailToleranceContext();
		context.ft = ft;
		return context;
	}

	/**
	 * set fail tolerance strategy
	 * @param ft
	 */
	public void setFailureTolerance(FailureTolerance ft) {
		this.ft = ft;
	}
	
	public <S,T,P> T invoke(S object, String methodName, P parameters){
		if(ft == null){
			 throw new IllegalStateException("no fail tolerance strategy, please set the strategy first before invoke");
		}
		return ft.invoke(object, methodName, parameters);
	}
	
}
