package com.java.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java.practice.EmployeeInfo.SortMethod;

class Employee {
	String name;
	int salary;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}

class EmployeeInfo1 {
	enum SortMethod implements Comparator<Employee> {
		BYNAME(Comparator.comparing(Employee::getName)), BYSALARY(Comparator.comparing(Employee::getSalary));

		private Comparator<Employee> comparator;

		@Override
		public int compare(Employee arg0, Employee arg1) {

			return comparator.compare(arg0, arg1);
		}

		SortMethod(Comparator<Employee> comparator) {
			this.comparator = comparator;
		}
	};

	public List<Employee> sort(List<Employee> emps, final SortMethod method) {
		return emps.stream().sorted(method.BYSALARY.thenComparing(method.BYNAME)).collect(Collectors.toList());
	}
}

public class EnumStream {

	public static void main(String[] args) {
		List<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee("Prahant", 50000));
		arrayList.add(new Employee("Aniket", 2500));
		arrayList.add(new Employee("Vinay", 25400));
		arrayList.add(new Employee("Amar", 2511));
		arrayList.add(new Employee("Monty", 5201));
		EmployeeInfo emp = new EmployeeInfo();

		List<Employee> res = emp.sort(arrayList, SortMethod.BYSALARY);
		res.stream().map(e -> e.getName() + " " + e.getSalary()).forEach(System.out::println);

		long count= arrayList.stream().filter(e -> String.valueOf(e.getName()).startsWith("A")).count();
		boolean matchName = arrayList.stream().anyMatch(e->e.getName().startsWith("A"));
		System.out.println(matchName+"this is the one");
		if(count > 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

		String match = "anik";
		switch (match) {
		case "anio":
			throw new RuntimeException();

		case "ani":
			System.out.println("Matches");
			break;

		}

	}

}
