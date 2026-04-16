package com.example.EmployeeManagementSystem.exception;

public class MandatoryFieldException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	String errMsg;
	
	public MandatoryFieldException(String errMsg) {
		this.errMsg=errMsg;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	

}
