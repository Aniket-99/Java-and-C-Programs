package com.practice.eis.exception;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws EmployeeException{
		Scanner sc = new Scanner(System.in);
		
		String name;
		double salary;
		
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		
		System.out.println("Enter your salary: ");
		salary = sc.nextDouble();
		
		Employee emp = new Employee();
		emp.checkSalary(name, salary);
		
		sc.close();

	}

}
