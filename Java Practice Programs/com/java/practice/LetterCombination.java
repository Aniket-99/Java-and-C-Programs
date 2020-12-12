package com.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class LetterCombination {

	public static void main(String[] args) {
		System.out.println(getLetterCombinations("023"));

	}

	static ArrayList<String> getLetterCombinations(String numerals) {
		ArrayList<String> combinationList = new ArrayList<>();
		HashMap<Character, String> phoneKeypad = new HashMap<>();
		phoneKeypad.put('1', " ");
		phoneKeypad.put('2', "abc");
		phoneKeypad.put('3', "def");
		phoneKeypad.put('4', "ghi");
		phoneKeypad.put('5', "jkl");
		phoneKeypad.put('6', "mno");
		phoneKeypad.put('7', "pqrs");
		phoneKeypad.put('8', "tuv");
		phoneKeypad.put('9', "wxyz");
		phoneKeypad.put('0', " ");

		// 23 --> ad,ae,af,bd,de,bf,cd,ce,cf
		// char[] charArray = numerals.toCharArray();
		// int size = charArray.length;
		// for(int i = 0; i < size; i++) {
		// if(charArray[i] == '0') {
		// continue;
		// }
		// else {
		// if(phoneKeypad.containsKey(charArray[i])) {
		// char[] s1 = phoneKeypad.get(charArray[i]).toCharArray();
		// if(phoneKeypad.containsKey(charArray[i+1])) {
		// char[] s2 = phoneKeypad.get(charArray[i+1]).toCharArray();
		//
		// for(char s1char : s1) {
		// for(char s2char: s2) {
		// String value = String.valueOf(s1char) + String.valueOf(s2char);
		// System.out.println(value);
		// }
		// }
		// }
		// }
		// }
		// }
		LinkedList<String> outputArray = new LinkedList<>();
		if (numerals.length() == 0) {
			return combinationList;
		}
		outputArray.add("");
		
		for (int i = 0; i < numerals.length(); i++) {
			// int index = Character.getNumericValue(numerals.charAt(i));
			char index = numerals.charAt(i);
			while (outputArray.peek().length() == i) {
				String permutation = outputArray.remove();

				for (Character c : phoneKeypad.get(index).toCharArray()) {
					outputArray.add(permutation + c);
				}
			}
		}
		combinationList.addAll(outputArray);
		return combinationList;

	}

}
