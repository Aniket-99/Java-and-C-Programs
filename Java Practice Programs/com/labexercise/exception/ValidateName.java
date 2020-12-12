package com.labexercise.exception;

import java.util.Scanner;

public class ValidateName {

	public static void main(String[] args) throws NoFullNameException {
		UserData userData = new UserData();
		Scanner sc = new Scanner(System.in);

		String firstName;
		String lastName;

		System.out.println("Enter you first name: ");
		firstName = sc.nextLine();

		System.out.println("Enter your last name: ");
		lastName = sc.nextLine();

		userData.setUser(firstName, lastName);

		sc.close();

	}

}

class UserData {
	private String firstName, lastName;

	void setUser(String firstName, String lastName) throws NoFullNameException {
		if ((firstName.isEmpty() && lastName.isEmpty())) {
			throw new NoFullNameException("First name and last name required");
		} 
		else if(firstName.isEmpty()) {
			throw new NoFullNameException("First name required");
		}
		else if(lastName.isEmpty()) {
			throw new NoFullNameException("Last name required");
		}
		else {
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("Your full name is: "+firstName + " "+ lastName);
		}
	}

}
