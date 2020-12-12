package com.java.practice;

import java.util.regex.Pattern;

public class StringHandling {

	public static void main(String[] args) {
		String fullName = "Aniket Keshav Karmakar";
		
		String[] splitted = fullName.split("\\s");
		System.out.println("The initals of full name is: ");
		for(int i = 0; i < splitted.length; i++) {
			System.out.println(splitted[i].charAt(0));
		}
		
		boolean p = Pattern.matches("([A-Z][a-zA-Z]*)\\s\\1", "Aniket Aniket Aniket");
		System.out.println(p);
	}

}
