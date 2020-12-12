package com.labexercise.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMedal {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of students: ");
		int total = sc.nextInt();
		sc.nextLine();

		while (total-- > 0) {
			System.out.println("Enter the Registration number: ");
			int registrationNo = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the marks: ");
			int marks = sc.nextInt();
			sc.nextLine();
			hashMap.put(registrationNo, marks);
		}
		System.out.println("The eligible student registration number with there medal is: ");
		HashMap<Integer, String> result = scholarshipEligibility(hashMap);
		for (Map.Entry<Integer, String> entry : result.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		sc.close();

	}

	public static HashMap<Integer, String> scholarshipEligibility(HashMap<Integer, Integer> hashMap) {
		HashMap<Integer, String> eligibility = new HashMap<>();

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			int marks = (int) entry.getValue();

			if (marks >= 90) {
				eligibility.put((int) entry.getKey(), "GOLD");
			} else if (marks >= 80 && marks < 90) {
				eligibility.put((int) entry.getKey(), "SILVER");
			} else if (marks >= 70 && marks < 80) {
				eligibility.put((int) entry.getKey(), "BRONZE");
			}
		}

		return eligibility;

	}

}
