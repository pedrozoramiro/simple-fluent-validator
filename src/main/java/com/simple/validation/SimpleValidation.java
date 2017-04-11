package com.simple.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import com.simple.validation.error.ValidationError;
import com.simple.validation.primitives.IntegerValidation;
import com.simple.validation.primitives.StringValidation;

public class SimpleValidation<T> {

	private T model;
	private List<ValidationError> errors;

	private SimpleValidation(T model) {
		this.model = model;
		errors = new ArrayList<ValidationError>();
	}

	public static <T> SimpleValidation<T> build(T model) {
		return new SimpleValidation<T>(model);
	}

	public void validate(Consumer<Void> throwException) {
		if (!errors.isEmpty()) {
			throwException.accept(null);
		}

	}

	public void addError(String message) {
		errors.add(new ValidationError(message));

	}

	public StringValidation<T> property(Function<? super T, String> getProperty) {
		return new StringValidation<T>(this, getProperty.apply(model));
	}

	public IntegerValidation<T> propertyInt(Function<? super T, Integer> getProperty) {
		return new IntegerValidation<T>(this, getProperty.apply(model));
	}

}
