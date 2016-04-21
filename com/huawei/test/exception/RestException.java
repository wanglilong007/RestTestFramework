package com.huawei.test.exception;

public abstract class RestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RestException(){}
	public RestException(String msg){
		super(msg);
	}

}
