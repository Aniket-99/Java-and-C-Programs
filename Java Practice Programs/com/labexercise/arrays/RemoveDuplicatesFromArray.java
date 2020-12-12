package com.labexercise.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of elements in the array: ");
		int size = sc.nextInt();
		
		if(size == 0 || size == 1) {
			System.out.println("Please enter more than 1 value");
			sc.close();
			return;
		}
		
		int[] array = new int[size];
		
		System.out.println("Enter the numbers: ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		int[] result = modifyArray(array);
		System.out.println("The array after removing duplicates and sorting in descending order is: ");
		for(int j = size-1; j >= 0; j--) {
			if(result[j] == 0) {
				continue;
			}
			else {
				System.out.println(result[j]);
			}
			
		}
		sc.close();
		
	}

	private static int[] modifyArray(int[] array) {
		int[] newArray = array;
		int size = newArray.length;
		Arrays.sort(newArray);
		
		int[] discriminate = new int[size];
		int index = 0;
		for(int i = 0; i < size-1; i++) {
			if(newArray[i] != newArray[i+1]) {
				discriminate[index++] = newArray[i];
			}
		}
		discriminate[index++] = newArray[size-1];
		
		for(int k = 0; k < size; k++) {
			newArray[k] = discriminate[k];
		}
		
		return newArray;
	}

}




