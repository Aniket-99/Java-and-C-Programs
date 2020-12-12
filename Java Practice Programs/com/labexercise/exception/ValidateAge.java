package com.labexercise.exception;

import java.util.Scanner;

public class ValidateAge {

	public static void main(String[] args) throws InvalidAgeException{
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Enter you name: ");
		name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		
		
		User user = new User();
		//user.getUser(name, age);
		try {
			user.setUser(name, age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}
}
class User {
	private String name;
	private int age;

	public void getUser(String name, int age) {

		try {
			if (age < 18) {
				throw new InvalidAgeException("You are not eligible to vote");
			} else {
				this.name = name;
				this.age = age;
				System.out.println("You are eligible to vote");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

	public void setUser(String name, int age) throws InvalidAgeException {

		
			if (age < 18) {
				throw new InvalidAgeException("You are not eligible to vote");
			} else {
				this.name = name;
				this.age = age;
				System.out.println("You are eligible to vote");
			}
		} 

}
