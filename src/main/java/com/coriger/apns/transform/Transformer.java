package com.coriger.apns.transform;

/**
 * @desc   转换器
 * @author ljt
 * @time   2016-1-8
 */
public interface Transformer<F,T> {
	
	public T transform(F from,Class<T> type);
	
}
