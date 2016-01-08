package com.coriger.apns.transform;

public abstract class AbstractTransformer<F,T> implements Transformer<F, T>{
	
	public T transform(F from, Class<T> type) {
		// 校验等操作
		if (from == null) {
			throw new IllegalArgumentException("from valus is null");
		}
		
//		type = ClassUtils.primitiveToWrapper(type);
//		
//		if (type == null) {
//			throw new IllegalArgumentException("Incorrect type for transformer class");
//		}

		return doTransform(from,type);
	};

	public abstract T doTransform(F from, Class<T> type);
	
}
