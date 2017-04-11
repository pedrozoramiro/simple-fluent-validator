package com.simple.validation.base;

import com.simple.validation.SimpleValidation;

public class BaseValidation<T> {
	private SimpleValidation<T> context;

	public BaseValidation(SimpleValidation<T> context) {
		this.context = context;
	}
	
	public SimpleValidation<T> next() {
		return context;
	}

	
	protected void addError(String message) {
		context.addError(message);
	}
}
