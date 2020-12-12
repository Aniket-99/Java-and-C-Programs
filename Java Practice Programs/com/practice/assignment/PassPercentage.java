package com.practice.assignment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PassPercentage {
	static ArrayList<Integer> studentMarksList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		try {
			while (choice <= 3) {
				System.out.println("1. Add student marks\n2. Find pass percentage\n3. Exit");

				PassPercentage passPercentage = new PassPercentage();
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("Enter the marks: ");
					int marks = sc.nextInt();
					passPercentage.addStudentDetails(marks);
				} else if (choice == 2) {
					int passPercent = passPercentage.findPassPercentage(studentMarksList);
					System.out.println("Percentage is: " + passPercent);
				} else if (choice == 3) {
					System.out.println("Thank you for using the Application");
					break;
				} else {
					System.out.println("Invalid choice!!");					
				}
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		sc.close();

	}

	public void addStudentDetails(int securedmarks) {
		studentMarksList.add(securedmarks);
	}

	public int findPassPercentage(List<Integer> studentMarksList) {
		int sizeOflist = studentMarksList.size();
		int passPercentage = 0;
		int count = 0;

		if (studentMarksList.isEmpty()) {
			System.out.println("No marks available");
		}

		Iterator iterator = studentMarksList.iterator();
		while (iterator.hasNext()) {
			int currentMarks = (int) iterator.next();
			if (currentMarks > 49) {
				count += 1;
			} else {
				continue;
			}
		}

		passPercentage = (count * 100) / sizeOflist;

		return passPercentage;

	}

}
