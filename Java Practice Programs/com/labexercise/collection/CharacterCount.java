package com.labexercise.collection;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of character: ");
		int total = sc.nextInt();
		char[] characterArray = new char[total];

		System.out.println("Enter the character: ");
		try {
			for (int i = 0; i < total; i++) {
				characterArray[i] = sc.next().charAt(0);
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

		Map<Character, Integer> result = countChars(characterArray);

		for (Map.Entry<Character, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		sc.close();

	}

	public static Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> countCharMap = new HashMap<>();

		for (char c : arr) {
			if (countCharMap.containsKey(c)) {
				countCharMap.put(c, countCharMap.get(c) + 1);
			} else {
				countCharMap.put(c, 1);
			}
		}

		return countCharMap;
	}
}
