package com.coriger.apns.model;

import java.lang.reflect.Method;

import com.coriger.apns.transform.Transformer;

public class MethodBean {
	
	private Object obj;
	
	private Method method;
	
	// 入站协议转换器
	private Transformer inTransform;
	
	private Class reqClass;
	
	// 出站协议转换器
	private Transformer outTransform;

	private Class respClass;
	
	public Transformer getInTransform() {
		return inTransform;
	}

	public void setInTransform(Transformer inTransform) {
		this.inTransform = inTransform;
	}

	public Class getReqClass() {
		return reqClass;
	}

	public void setReqClass(Class reqClass) {
		this.reqClass = reqClass;
	}

	public Transformer getOutTransform() {
		return outTransform;
	}

	public void setOutTransform(Transformer outTransform) {
		this.outTransform = outTransform;
	}

	public Class getRespClass() {
		return respClass;
	}

	public void setRespClass(Class respClass) {
		this.respClass = respClass;
	}

	public MethodBean(Object obj, Method method) {
		super();
		this.obj = obj;
		this.method = method;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}
	
}
