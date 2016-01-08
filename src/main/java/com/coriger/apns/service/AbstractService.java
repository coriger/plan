package com.coriger.apns.service;

import java.lang.reflect.InvocationTargetException;

import com.coriger.apns.model.MethodBean;
import com.coriger.apns.transform.Transformer;

public abstract class AbstractService implements Service{
	
	public abstract void init();

	@Override
	public void doService(Object req, MethodBean mb) {
		Transformer inTransform = mb.getInTransform();
		Class reqClass = mb.getReqClass();
		Transformer outTransform = mb.getOutTransform();
		Class respClass = mb.getRespClass();
		Object result = null;
		try {
			if(inTransform != null && reqClass != null){
				req = inTransform.transform(req,reqClass);
			}
			result = mb.getMethod().invoke(mb.getObj(), req);
			// 判断是否需要出站协议转换
			if(outTransform != null && respClass != null){
				// 出站协议转换
				result = outTransform.transform(result,respClass);
			}
			// 响应内容
			if(result != null){
				response(result);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 响应内容 由子类实现  json xml等格式
	 * @param result
	 */
	public abstract void response(Object result);
	
}
