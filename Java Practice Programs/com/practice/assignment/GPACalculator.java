package com.practice.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GPACalculator {
	static ArrayList<Integer> gradePointList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice <= 3) {
			System.out.println("1. Add GradePoint\n2. Calculate GPA\n3. Exit");

			GPACalculator gpaCalculator = new GPACalculator();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter the grade point: ");
				int gradePoint = sc.nextInt();
				gpaCalculator.addGradeDetails(gradePoint);
			} else if (choice == 2) {
				double score = gpaCalculator.getGPAScored(gradePointList);
				System.out.println("GPA Scored is: " + score);
			} else if (choice == 3) {
				System.out.println("Thank you for using the Application");
				break;
			} else {
				System.out.println("Please enter valid choice");
			}
		}

		sc.close();

	}

	public void addGradeDetails(int gradePoint) {

		gradePointList.add(gradePoint);

	}

	public double getGPAScored(List<Integer> gradePointList) {
		int sizeOflist = gradePointList.size();
		int creditPoint = 3;
		double GPAScore = 0;
		int sum = 0;
		System.out.println(gradePointList);
		for (int i = 0; i < sizeOflist; i++) {
			//GPAScore = GPAScore + (gradePointList.get(i) * creditPoint) / (sizeOflist * 3);
			sum += (gradePointList.get(i) * creditPoint);			
			GPAScore = sum/(sizeOflist * 3);
		}
		
//		for (int i = 0; i < sizeOflist; i++) {
//			System.out.println(gradePointList.get(i));
//		}
		return GPAScore;
	}
}
