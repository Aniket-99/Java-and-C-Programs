package com.labexercise.arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of strings in an array: ");
		int size = sc.nextInt();
		
		String[] arrayString = new String[size];
		System.out.println("Enter the string: ");
		for(int i = 0; i < size; i++) {
			arrayString[i] = sc.next();
		}
		
		String[] result = sortStrings(arrayString);
		System.out.println("The sorted string is: ");
		for(int j = 0 ; j < size; j++) {
			System.out.println(result[j]);
		}
		
		sc.close();
	}
	private static String[] sortStrings(String[] arrayString) {
		String[] newArray = arrayString;
		int size = newArray.length;
		for(int i = 0; i < size-1; i++) {
			for(int j = i + 1; j < size; j++) {
				if(newArray[i].compareTo(newArray[j]) > 0) {
					String tempVariable = newArray[i];
					newArray[i] = newArray[j];
					newArray[j] = tempVariable;
				}
			}
		}
		
		return newArray;
		
	}
}
