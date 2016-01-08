package com.coriger.apns.router;

public class Router {
	
	public void router(){
//		source: servlet mvc netty
//		format: json xml

//		1、判断来源地址 找到对应业务类
//		2、进入过滤器链  进行鉴权、限流、校验、协议转换、日志等
//		3、业务处理
//		4、出站协议转换
//		5、响应
	}
}

//+++++++++++++++++++++++++++++++++++++
//
//request  -->> transport -->> filter -->> router -->> service -->> filter -->> transport
//
//(接入请求-->>入站协议转换-->>过滤器链-->>路由业务-->>出站协议转换)
//
//+++++++++++++++++++++++++++++++++++++