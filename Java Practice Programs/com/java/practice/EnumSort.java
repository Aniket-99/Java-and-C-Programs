package com.java.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.practice.EmployeeInfo.SortMethod;

class EmployeeData {
	String name;
	int salary;
	
	public EmployeeData() {
		
	}

	EmployeeData(String name, int salary) {
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

class EmployeeInfoClass {
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

	public List<EmployeeData> sort(List<EmployeeData> emps, final SortMethod method) {
		List<EmployeeData> empList=new ArrayList<EmployeeData>();
		if(method.name().equals("BYNAME")) {
			empList = emps.stream().sorted(new NameImple()).collect(Collectors.toList());
		}
		if(method.name().equals("BYSALARY")) {
			empList = emps.stream().sorted(new Salaryimple()).collect(Collectors.toList());
		}
		return empList;
	
	}
}

class NameImple implements Comparator<EmployeeData>{

	@Override
	public int compare(EmployeeData emp1, EmployeeData emp2) {
		
		System.out.println(emp1.getName().compareTo(emp2.getName()));
		return emp1.getName().compareTo(emp2.getName());
	}
}

class Salaryimple implements Comparator<EmployeeData>{
	
	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {

		if(e1.getSalary() < e2.getSalary()) {
			return -1;
		}
		else if(e1.getSalary() == e2.getSalary()) {
			return 0;
		}
		else {
			return 0;
		}
	}
}


public class EnumSort {

	public static void main(String[] args) {
		List<EmployeeData> arrayList = new ArrayList<>();
		arrayList.add(new EmployeeData("Prahant", 50000));
		arrayList.add(new EmployeeData("Aniket", 2500));
		arrayList.add(new EmployeeData("Vinay", 25400));
		arrayList.add(new EmployeeData("Amar", 2511));
		arrayList.add(new EmployeeData("Monty", 5201));
		
		com.java.practice.EmployeeInfoClass.SortMethod st = com.java.practice.EmployeeInfoClass.SortMethod.BYSALARY;
		EmployeeInfoClass cls = new EmployeeInfoClass();
		List<EmployeeData> data = cls.sort(arrayList, st);
		data.forEach(System.out::println);
		
//		EmployeeInfo emp = new EmployeeInfo();
//		EmployeeInfoClass empClas = new EmployeeInfoClass();
//		List<Employee> res = emp.sort(arrayList, SortMethod.BYSALARY);
//		//res.stream().map(e -> e.getName() + " " + e.getSalary()).forEach(System.out::println);
//		res.forEach(System.out::println);
		
		
//		boolean res = Pattern.matches("^[7|8|9][0-9]{9}","7854561274");
//	    System.out.println(res);
		
	}

}
