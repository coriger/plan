package com.coriger.apns.model;

import com.coriger.apns.validate.Validate;
import com.coriger.apns.validate.ValidateResult;

public class V1Req implements Validate{

	private int v1;
	
	private V2Req req;
	
	@Override
	public ValidateResult validate() {
		ValidateResult result = new ValidateResult();
		
		if(req.validate().getResultCode() != 0){
			result.setResultMsg(req.validate().getResultMsg());
		}
		
		return result;
	}
	
}
