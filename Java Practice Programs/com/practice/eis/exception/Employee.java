package com.practice.eis.exception;

public class Employee {
	private String employeeName;
	private double salary;
	
	void checkSalary(String name, double salary) throws EmployeeException{
		
		if(salary < 3000) {
			throw new EmployeeException("Salary is below 3000");
		}
		else {
			this.employeeName = name;
			this.salary = salary;
			System.out.println("Employee name is: "+employeeName);
			System.out.println("Employee salary is: "+salary);
		}
		
	}
	
	
}
