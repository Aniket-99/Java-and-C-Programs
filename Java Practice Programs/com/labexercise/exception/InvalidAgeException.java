package com.labexercise.exception;

class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {

	}

	public InvalidAgeException(String message) {
		super(message);
	}
}