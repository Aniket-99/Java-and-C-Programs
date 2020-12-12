package com.java.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeInfo {

	enum SortMethod{
		BYNAME, BYSALARY;

	};

	public static List<Employee> sort(List<Employee> list, final SortMethod a) {
		/*
		 * Comparator<Employee> name = Comparator.comparing(Employee :: getName);
		 * Comparator<Employee> salary = Comparator.comparing(Employee :: getSalary);
		 * Comparator<Employee> finalsort = name.thenComparing(salary); List<Employee>
		 * sortedlist = list.stream() .sorted(finalsort) .collect(Collectors.toList());
		 * System.out.println(sortedlist);
		 */
		List<Employee> emplist = new ArrayList<Employee>();
		if (a.name().equals("BYNAME")) {
			emplist = list.stream().sorted(new NameImpl()).collect(Collectors.toList());
		} else if (a.name().equals("BYSALARY")) {
			emplist = list.stream().sorted(new SalaryImpl()).collect(Collectors.toList());
		}
		return emplist;

		// System.out.println("enum: "+java.util.Arrays.asList(SortMethod.values()));

	}
	public void isCharacter(List<Employee> list, String c) {

		Predicate<Employee> obj = (a) -> a.name.startsWith(c);
		boolean res = list.stream().anyMatch(obj);
		System.out.println(res);
	}

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("vinita", 50000));
		list.add(new Employee("anisha", 70000));
		list.add(new Employee("tanvi", 30000));
		list.add(new Employee("swara", 20000));
		list.add(new Employee("shweta", 60000));
		list.add(new Employee("leena", 50000));
		// com.cg.eis.testquestions.EmployeeInfo.SortMethod st =
		// com.cg.eis.testquestions.EmployeeInfo.SortMethod.BYSALARY;
		EmployeeInfo ob = new EmployeeInfo();
		// List<Employee> data = sort(list, st);
		// data.forEach(System.out::println);
		ob.isCharacter(list, "a");

		/*
		 * Stream<Employee> emplist = list.stream(); EmployeeInfo ob = new
		 * EmployeeInfo(); String str = "BYNAME"; List<Employee> finallist = sort(list,
		 * SortMethod.valueOf(str)); System.out.println(finallist); String str2 =
		 * "BYSALARY"; ob.sort(list, SortMethod.valueOf(str)); ob.sort(list,
		 * SortMethod.valueOf(str2));
		 */

	}

}
class NameImpl implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}
}

class SalaryImpl implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getSalary() < emp2.getSalary())
			return -1;
		else if (emp1.getSalary() == emp2.getSalary())
			return 0;
		else
			return 1;
	}
}
