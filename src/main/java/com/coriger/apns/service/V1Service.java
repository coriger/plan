package com.coriger.apns.service;

import com.coriger.apns.annotation.Config;
import com.coriger.apns.model.MethodBean;
import com.coriger.apns.model.V1Req;
import com.coriger.apns.model.V1Resp;
import com.coriger.apns.model.V2Req;
import com.coriger.apns.model.V2Resp;
import com.coriger.apns.transform.V1Transformer;

/**
 * @desc   v1 controller servlet 新版服务接入
 * @author ljt
 * @time   2016-1-8
 */
public class V1Service extends AbstractService{
	
	private ConfigManager configManager;
	
	@Override
	public void init() {
		// 初始化服务  生成MethodBean
		configManager.registerMapping(this);
	}
	
	@Config(inbound=V1Transformer.class,outbound=V1Transformer.class)
	public void send(Object req,Object resp){
		// 根据当前方法名路由到MethodBean
		MethodBean mb = configManager.lookupMapping(Thread.currentThread().getStackTrace()[2].getMethodName());
		doService(req, mb);
	}
	
	@Config(inbound=V1Transformer.class,outbound=V1Transformer.class)
	public void add(Object req,Object resp){
		// 根据当前方法名路由到MethodBean
		MethodBean mb = configManager.lookupMapping(Thread.currentThread().getStackTrace()[2].getMethodName());
		doService(req, mb);
	}
	
	@Override
	public void response(Object result) {
		
	}
	
}
