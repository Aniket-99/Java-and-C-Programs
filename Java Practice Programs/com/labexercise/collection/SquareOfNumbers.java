package com.labexercise.collection;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class SquareOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of integers: ");
		int total = sc.nextInt();
		
		System.out.println("Enter the numbers: ");
		int[] integerArray = new int[total];
		try {
			for (int i = 0; i < total; i++) {
				integerArray[i] = sc.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
		
		Map<Integer, Integer> result = getSquares(integerArray);
		
		System.out.println("The squares of the number is: ");
		
		for(Map.Entry entry : result.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		sc.close();
	}
	
	public static Map<Integer, Integer> getSquares(int[] integerArray){
		
		Map<Integer, Integer> squareMap = new HashMap<>();
		
		for(int number: integerArray) {
			squareMap.put(number, number * number);
		}
		
		

		return squareMap;
	}

}
