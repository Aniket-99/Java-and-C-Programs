package com.practice.assignment;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeCount {

	static Map<Integer, Character> studentMap = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		try {
			while (choice <= 3) {
				
				System.out.println("1. Add Student details\n2.Find Count of students\n3. Exit");
				StudentGradeCount studentGradeCount = new StudentGradeCount();
				System.out.println("Enter your choice");
				choice = sc.nextInt();

				if (choice == 1) {
					
					System.out.println("Enter the roll number: ");
					int rollNo = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the grade: ");
					char grade = sc.next().charAt(0);

					studentGradeCount.addStudentDetails(rollNo, grade);
				} 
				else if (choice == 2) {
					
					System.out.println("Enter the grade to find the counts of students: ");
					char findGrade = sc.next().charAt(0);
					int totalcount = studentGradeCount.findCountOfStudents(findGrade);
					
					if(totalcount <= 0) {
						
						System.out.println("No students found");
					}
					else {
						
						System.out.println("The total count of student secured " + findGrade + " is " + totalcount);
					}
					
				}
				else if (choice == 3) {
					
					System.out.println("Thank you for using the application");
					break;
				} 
				else {
					
					System.out.println("Invalid choice");
				}
			}
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
		finally{
			sc.close();
		}
	}

	public void addStudentDetails(int rollNumber, char securedGrade) {
		studentMap.put(rollNumber, securedGrade);
	}

	public int findCountOfStudents(char grade) {
		int count = 0;

		if (studentMap.containsValue(grade)) {
			for (Map.Entry entry : studentMap.entrySet()) {
				if (entry.getValue().equals(grade)) {
					count += 1;
				}
			}
		}
		else {
			return 0;
		}

		return count;

	}

}
