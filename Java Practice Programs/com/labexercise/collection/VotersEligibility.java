package com.labexercise.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class VotersEligibility {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of voters: ");
		int total = sc.nextInt();
		sc.nextLine();

		while (total-- > 0) {
			System.out.println("Enter the ID number: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the birth date(yyyy-mm-dd): ");
			String dateOfBirth = sc.nextLine();
			hashMap.put(id, dateOfBirth);
		}
		List<Integer> result = votersEligibility(hashMap);
		if (result.isEmpty()) {
			System.out.println("Error");
		} 
		else {
			System.out.println("The person id number who is eligible for voting: ");
			Iterator<Integer> iterator = result.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}

		sc.close();
	}

	public static List<Integer> votersEligibility(HashMap<Integer, String> hashMap) {
		List<Integer> eligibility = new ArrayList<>();
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			if (isGreater((String) entry.getValue())) {
				eligibility.add((int) entry.getKey());
			} else {
				continue;
			}
		}

		return eligibility;

	}

	public static boolean isGreater(String dateOfBirth) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		boolean flag = false;
		try {
			LocalDate date = LocalDate.parse(dateOfBirth, dateFormatter);
			LocalDate todaysDate = LocalDate.now();

			int personBirthYear = date.getYear();
			int currentYear = todaysDate.getYear();
			int currentAge = Math.abs(currentYear - personBirthYear);
			//Period p = Period.between(date, todaysDate);
			//System.out.println(p.getYears()+": difference date..........");
			if (currentAge > 18) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (DateTimeParseException e) {
			System.out.println(e.getMessage());
		}

		return flag;
	}

}
