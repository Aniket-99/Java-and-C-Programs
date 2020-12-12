package com.stream.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeImplementation {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Aniket", 5000, "nitin", "20"));
		employeeList.add(new Employee(2, "Anisha", 15000, "Shradhha", "40"));
		employeeList.add(new Employee(3, "Prashant", 50000, "Tanmaya", "10"));
		employeeList.add(new Employee(4, "tejas", 40000, "nitin", "20"));
		employeeList.add(new Employee(5, "Vinay", 25000, "Shraddha", "20"));
		employeeList.add(new Employee(5, "", 25000, "Shraddha", "20"));
		
		// Department with no employee
		System.out.println("Department with no employee: ");
		List<Employee> emp1 = employeeList.stream()
										.filter(e->e.getName().equals(""))
										.collect(Collectors.toList());
//		ArrayList<Employee> emp= new ArrayList<>(emp1);
		for(Employee e:emp1) {
			System.out.println(e.getDeptNo());
		}
		
		// 1st problem
		double highestSalary = employeeList.stream()
								.map(emp->emp.getSalary())
								.reduce(0d, Double::max);
		Optional<Employee> high = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee e1 = high.get();
		System.out.println("The employee with highest salary is: "+highestSalary);
		System.out.println("The employee with highest salary 2nd method is: "+e1.getName()+" :"+e1.getSalary());
		System.out.println("======================");
		
		// 2nd problem
		int count = (int) employeeList.stream()
					.filter(emp->emp.getMgrName().equals("nitin"))
					.count();
		System.out.println("The count of people reporting to nitin is: "+count);
		System.out.println("======================");
		// 3rd problem
		
		List<Employee> emp = employeeList.stream()
							.filter(e -> e.getSalary() < 50000)
							.collect(Collectors.toList());
		
		System.out.println("The employee whose salary is lesss than 50000 is: ");
		emp.forEach(e->System.out.println(e.getName()));
		
		System.out.println("======================");
		// 4th problem
		
		List<Employee> deptNo10 = employeeList.stream()								
								  .filter(e -> e.getDeptNo() == "10")
								  .collect(Collectors.toList());
		System.out.println("The employee belongs to department 10 are: ");
		deptNo10.forEach(e -> System.out.println(e.getName()));
								  
		System.out.println("======================");
		// 5th problem
		
		int countOf20 = (int)employeeList.stream()
						.filter(e -> e.getDeptNo() == "20")
						.count();
		System.out.println("The count of employee who work in department 20 is: "+countOf20);
		
		System.out.println("======================");
		// 6th problem
		
		List<Employee> startsWithA = employeeList.stream()
									.filter(e -> e.getName().startsWith("A"))
									.collect(Collectors.toList());
		
		System.out.println("The list of employeee whose name starts with A are: ");
		startsWithA.forEach(e -> System.out.println(e.getName()));
		
	}

}
