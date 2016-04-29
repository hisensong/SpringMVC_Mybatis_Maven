package com.ssmm.common;

/**
 * 异常处理类
 * @author HisenSong
 *
 */
public class SsmmException extends RuntimeException{
	
	private String code;
    private String msg;
    private Throwable e;
    
    public SsmmException(String msg) {
        super(msg);
        this.msg = msg;
    }
    
    public SsmmException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
    
    public SsmmException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.e = e;
    }

    public SsmmException(String code, String msg, Throwable e) {
        super(msg, e);
        this.code = code;
        this.msg = msg;
        this.e = e;
    }

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Throwable getE() {
		return e;
	}
	public void setE(Throwable e) {
		this.e = e;
	}

}
