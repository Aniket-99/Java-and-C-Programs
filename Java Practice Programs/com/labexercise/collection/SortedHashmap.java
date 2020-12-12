package com.labexercise.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedHashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number of inputs: ");
			int total = sc.nextInt();
			sc.nextLine();

			while (total-- > 0) {
				System.out.println("Enter the name: ");
				String name = sc.findInLine("\\D+");
				name = name.trim();
				System.out.println("Enter the number: ");
				int contact = sc.nextInt();
				sc.nextLine();
				hashMap.put(name, contact);
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		List<Integer> arrayList = getValues(hashMap);
		arrayList.forEach(System.out::println);

//		Iterator iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println((Integer) iterator.next());
//		}

		sc.close();

	}

	public static List<Integer> getValues(HashMap<String, Integer> hashMap) {

		List<Integer> sortedList = new ArrayList<>();
		 hashMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
//		for (Map.Entry entry : hashMap.entrySet()) {
//			sortedList.add((int) entry.getValue());
//		}
//
//		Collections.sort(sortedList);
		

		//return sortedList;
		 ArrayList<Integer> sorted = new ArrayList<>();
		 for(Entry<String, Integer> entry: hashMap.entrySet()) {
			 sorted.add(entry.getValue());
		 }
		 
		 System.out.println(sorted);
		 Collections.sort(sorted);
		 return sorted;
		 
		 
	}

}
