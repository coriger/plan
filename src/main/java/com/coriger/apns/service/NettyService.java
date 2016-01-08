package com.coriger.apns.service;

import com.coriger.apns.annotation.Cmd;
import com.coriger.apns.model.MethodBean;
import com.coriger.apns.model.Resp;

/**
 * @desc   适配老推送服务
 * @author ljt
 * @time   2016-1-8
 */
public class NettyService extends AbstractService{
	
	private ConfigManager configManager;
	
	@Override
	public void init() {
		// 初始化服务  生成MethodBean
		configManager.registerCmd(this);
	}
	
	public void route(String cmd,Object req){
		// 根据cmd路由到MethodBean
		MethodBean mb = configManager.lookupCmd(cmd);
		doService(req, mb);
	}
	
	@Cmd("PushService.stopPush")
	public Resp stopPush(String reqJson){
    	return new Resp();
    }
	
	@Override
	public void response(Object result) {
		// 从线程上下文中取出写出器
		
	}
	
}
