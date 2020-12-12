package com.practice.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.*;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.Service;
public class Main {

	public static void main(String[] args) {
		int id=0;
		String name="", designation="";
		double salary=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========Enter the employee details:======= ");
		System.out.println("Enter the id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name: ");
		name = sc.nextLine();
		System.out.println("Enter the designation: ");
		designation = sc.nextLine();
		System.out.println("Enter the salary: ");
		salary = sc.nextDouble();
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setDesignation(designation);
		employee.setSalary(salary);
		
		EmployeeService employeeService = new Service();
		System.out.println("The employee details is: ");
		employeeService.getEmployeeDetails(employee);
		System.out.println("The insurance scheme available to you is: ");
		String scheme= employeeService.findInsuranceScheme(employee.getDesignation(), employee.getSalary());
		System.out.println(scheme);
		//employeeService.displayDetails();
		//System.out.println(employee.toString());
		sc.close();
		
		

	}

}
