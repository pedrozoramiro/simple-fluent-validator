package com.simple.validation.primitives;

import com.simple.validation.SimpleValidation;
import com.simple.validation.base.BaseValidation;

public class StringValidation<Tmodel> extends BaseValidation<Tmodel> {

	private String value;

	public StringValidation(SimpleValidation<Tmodel> context, String value) {
		super(context);
		this.value = value;
	}

	public StringValidation<Tmodel> isNotEmpty() {
		if (value == null || value.isEmpty()) {
			addError("isEmpty");
		}
		return this;
	}

	public StringValidation<Tmodel> isMaxlength(int max) {
		if (value.length() > max) {
			addError("isMaxlength");
		}
		return this;
	}

}
