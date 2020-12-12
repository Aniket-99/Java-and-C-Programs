package com.java.practice;

import java.util.regex.Pattern;

class Email {
	private String from;
	private String to;
	private String subject;
	private String body;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public boolean validate(String email) {
		boolean p = Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+_.-]$", "example.samplemail@gmail.com");
		return p;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Email [from=");
		builder.append(from);
		builder.append(", to=");
		builder.append(to);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", body=");
		builder.append(body);
		builder.append("]");
		return builder.toString();
	}
	
}

class Sender<T>{
	private T message;

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
	
	public void sendMessage() {
		System.out.println("Message type: "+getMessage().getClass());
		System.out.println("Contents are: "+getMessage());
	}
}

