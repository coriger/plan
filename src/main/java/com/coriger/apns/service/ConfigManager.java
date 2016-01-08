package com.coriger.apns.service;

import java.util.concurrent.ConcurrentHashMap;

import com.coriger.apns.model.MethodBean;

public class ConfigManager {

	private ConcurrentHashMap<String, MethodBean> mbMap = new ConcurrentHashMap<String, MethodBean>(); 
	
	public void registerMapping(Service service) {
		// 查询有RequestMap注解的方法 
		
		// 查询config注解的配置项
		
		// 封装成MethodBean

		// ReflectUtils自动获取协议转换器的泛型实际类型  放入reqClass respClass 
		
	}
	
	public void registerCmd(Service service) {
		// 查询有RequestMap注解的方法 
		
		// 查询config注解的配置项
		
		// 封装成MethodBean

		// ReflectUtils自动获取协议转换器的泛型实际类型  放入reqClass respClass 
		
	}

	public MethodBean lookupMapping(String methodName) {
		return mbMap.get(methodName);
	}
	
	public MethodBean lookupCmd(String methodName) {
		return mbMap.get(methodName);
	}

}
