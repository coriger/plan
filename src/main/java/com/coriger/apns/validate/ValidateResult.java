package com.coriger.apns.validate;

/**
 * @desc   校验结果
 * @author ljt
 * @time   2016-1-8
 */
public class ValidateResult {
	
	// 校验结果码
	private int resultCode;
	
	// 校验信息
	private int resultMsg;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public int getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(int resultMsg) {
		this.resultMsg = resultMsg;
	}
}
