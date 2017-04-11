package com.simple.validation.error;

public class ValidationError {

	private String message;

	public ValidationError(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
