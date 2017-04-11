package com.simple.validation.primitives;

import com.simple.validation.SimpleValidation;
import com.simple.validation.base.BaseValidation;

public class IntegerValidation<Tmodel> extends BaseValidation<Tmodel> {

	private Integer value;

	public IntegerValidation(SimpleValidation<Tmodel> context,Integer value) {
		super(context);
		this.value = value;
	}

	
	public IntegerValidation<Tmodel> isMinusThan(int minimum) {
		if (value < minimum) {
			addError("isMinusThan");
		}
		return this;
	}

	public IntegerValidation<Tmodel> isMoreThan(int max) {
		if (value > max) {
			addError("isMaxlength");
		}
		return this;
	}
}
