package com.coriger.apns.transform;

import com.coriger.apns.model.Req;
import com.coriger.apns.model.V2Req;

/**
 * @desc   V2版本对象协议转换器
 * @author ljt
 * @time   2016-1-8
 */
public class V2Transformer extends AbstractTransformer<V2Req, Req>{
	
	@Override
	public Req doTransform(V2Req from, Class<Req> type) {
		Req req = new Req();
		
		// 协议转换的逻辑
		
		return req;
	}
	
}