package com.coriger.apns.service;

import com.coriger.apns.model.MethodBean;

/**
 * @desc   服务接口
 * @author ljt
 * @time   2016-1-8
 */
public interface Service {
	
	/**
	 * 服务初始化  收集服务接入点数据
	 */
	public void init();
	
	/**
	 * 执行业务
	 * @param obj
	 * @param mb
	 */
	public void doService(Object obj,MethodBean mb);
	
}