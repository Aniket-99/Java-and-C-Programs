package com.labexercise.exception;

public class NoFullNameException extends Exception{
	
	public NoFullNameException() {
		
	}
	
	public NoFullNameException(String name) {
		super(name);
	}
	
}
