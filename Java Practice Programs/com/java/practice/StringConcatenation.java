package com.java.practice;

import java.util.regex.Pattern;

public class StringConcatenation {

	public static void main(String[] args) {

		String result = nonStart("Hello", "There");
		System.out.println(result);
		System.out.println(xyzThere("abc"));
		mixString("xxxx", "There");
		repeatEnd("aniket", 4);
		firstHalf("HelloThere");
		extraEnd("Hello");
		repeatFront("Chocolate", 4);
		bobThere("b9b");
		xyBalance("aaxbb");
		
		String[] arr = {"this", "not", "too", "long"};
		noLong(arr);
		String[] arr2 = {"xxy", "yay", "zzy"};
		noYY(arr2);
		int[] arr3 = {12, 13, 19, 20};
		noTeen(arr3);
	}

	public static String nonStart(String str1, String str2) {
		String newString1 = str1.substring(1);
		String newString2 = str2.substring(1);

		StringBuffer buffer = new StringBuffer();
		buffer.append(newString1);
		buffer.append(newString2);

		return buffer.toString();
	}

	public static boolean xyzThere(String str) {

		if (str.contains(".xyz")) {
			return false;
		} else if (!(str.contains("xyz"))) {
			return false;
		} else {
			return true;
		}

	}

	public static void mixString(String str1, String str2) {
		int min = Math.min(str1.length(), str2.length());
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < min; i++) {
			buffer.append(str1.charAt(i));
			buffer.append(str2.charAt(i));
		}

		buffer.append(str1.substring(min));
		buffer.append(str2.substring(min));
		System.out.println(buffer.toString());
	}

	public static void repeatEnd(String str, int n) {

		String newString = str.substring(n);
		System.out.println(newString);
		StringBuffer buffer = new StringBuffer(n * str.length());
		for (int i = 0; i < n; i++) {
			buffer.append(newString);
		}
		System.out.println(buffer.toString());
	}

	public static void firstHalf(String str) {
		int size = str.length();
		int half = size / 2;
		String firstHalf = str.substring(0, half);
		System.out.println("First Half is: ");
		System.out.println(firstHalf);
	}

	public static void extraEnd(String str) {
		StringBuffer buffer = new StringBuffer();
		// System.out.println(str.substring(str.length()-2));
		String lastTwoChar = str.substring(str.length() - 2);
		for (int i = 0; i < 3; i++) {
			buffer.append(lastTwoChar);
		}
		System.out.println("Extra end is: ");
		System.out.println(buffer.toString());
	}

	public static void repeatFront(String str, int n) {

		String newString = "";
		for (int i = n; n > 0; n--) {
			newString += str.substring(0, n);
		}
		System.out.println("The repeat front is: ");
		System.out.println(newString);
	}

	public static void bobThere(String str) {
		boolean pattern = Pattern.matches("b[a-zA-Z0-9]b+", str);
		System.out.println("Is bob there in the string?? " + pattern);
	}

	public static void xyBalance(String str) {
		if (!str.contains("x")) {
			System.out.println("true");			
		}
		int x = str.lastIndexOf("x");
		int y = str.lastIndexOf("y");
		if (x < y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static void noLong(String[] arr) {
		int size = arr.length;
		String[] newArray = new String[size];
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < size; i++) {
			if(arr[i].length() < 4) {
				buffer.append(arr[i]);
				buffer.append(" ");
			}
			else {
				continue;
			}
		}
		System.out.println("The not too long string is: ");
		System.out.println(buffer.toString());
	}
	
	public static void noYY(String[] arr) {
		int size = arr.length;
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < size; i++) {
			int currentStringSize = arr[i].length();
			int lastIndexOfY = arr[i].lastIndexOf("y");
			if((currentStringSize - 1) == lastIndexOfY) {
				continue;
			}
			else {
				buffer.append(arr[i] + "y");
			}
		}
		System.out.println("The NoYY is: ");
		System.out.println(buffer.toString());
		//remaining
	}
	
	public static void noTeen(int[] arr) {
		int[] newArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 13 || arr[i] == 19) {
				continue;
			}
			else {
				newArr[i] = arr[i];
			}
		}
		System.out.println("The no teen is: ");
		for(int i = 0; i < newArr.length; i++) {
			if(newArr[i] == 0) {
				return;
			}
			else {
				System.out.println(newArr[i]);
			}
		}
	}
	
	
}
