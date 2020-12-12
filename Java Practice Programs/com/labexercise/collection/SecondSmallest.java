package com.labexercise.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of integers in array: ");

		int total = sc.nextInt();
		int[] array = new int[total];
		
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < total; i++) {
			array[i] = sc.nextInt();
		}

		int result = getSmallestElementInList(array);
		System.out.println("The second smallest element in the array is :"+result);
		sc.close();

	}

	public static int getSmallestElementInList(int[] array) {
		List<Integer> arrayList = new ArrayList<>();
		
		// need modification for time complexity..will do it later
		for(int value : array) {
			arrayList.add(value);
		}
		Collections.sort(arrayList);
		
		return arrayList.get(1);
	}

}
