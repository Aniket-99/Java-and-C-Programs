package com.java.practice;

public class Executor {

	public static void main(String[] args) {

				Email emp = new Email();
				emp.setFrom("example.samplemail@gmail.com");
				emp.setTo("example.samplemail@gmail.com");
				System.out.println(emp.validate("example.samplemail@gmail.com"));
				if(emp.validate("example.samplemail@gmail.com")) {
					emp.setSubject("Need to block cafeteria for personal event");
					emp.setBody("Hello world");
					
				}
				else {
					System.out.println("Invalid email");
				}
				
				Sender<Email> sender = new Sender<Email>();
				sender.setMessage(emp);
				sender.sendMessage();


	}

}
