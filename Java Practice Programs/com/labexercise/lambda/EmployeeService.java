package com.labexercise.lambda;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository = null;
		List<Employee> empList = employeeRepository.getEmployees();
		List<Department> deptList = employeeRepository.getDepartments();
		double result = sumOfSalary(empList);
		// System.out.println("The sum of salary is: "+result);
		//deptAndCount(empList, deptList);
		//seniorEmployee(empList);
		 //nameAndDuration(empList);
		// empWithoutDept(empList);
		// empDetails(empList);
		// empStartOnFriday(empList);
		// employeeReporting(empList);
		// employeeNotReporting(empList);
		// sortByEmpId(empList);
		// sortByDeptId(empList);
		// sortByName(empList);
		 //increaseSalary(empList);
		deptWithHighestCount(empList);

	}

	public static double sumOfSalary(List<Employee> empList) {
		double total = empList.stream().map(emp -> emp.getSalary()).reduce(0d, Double::sum);

		return total;
	}

	public static void deptAndCount(List<Employee> empList, List<Department> deptList) {
//		System.out.println("The department names is: ");
//		deptList.forEach((e) -> {
//			System.out.println(e.getDepartmentName());
//		});
//		System.out.println("Employee count in each department is: ");
//		Map<String, List<Department>> deptCount = deptList.stream()
//				.collect(Collectors.groupingBy((emp) -> emp.getDepartmentName()));
//		for (String dept : deptCount.keySet()) {
//			System.out.println(dept + ": " + deptCount.get(dept).size());
//		}
		Map<Department, Long> employeeCountByDept = empList.stream()
													.filter(e->e.getDepartment()!=null)
													.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		
		for(Map.Entry emp : employeeCountByDept.entrySet()) {
			System.out.println(emp.getKey() +" "+emp.getValue());
		}
		
		
	}

	public static void seniorEmployee(List<Employee> empList) {
		Integer maxYear = empList.stream().map(e -> e.getHireDate().getYear()).max(Integer::compare).get();

		List<Employee> emp = empList.stream().filter((e) -> e.getHireDate().getYear() == maxYear)
				.collect(Collectors.toList());
		System.out.println("Senior employee are: ");
		for (Employee emp1 : emp) {
			System.out.println(emp1.getFirstName() + " " + emp1.getLastName());
		}


	}

	public static void nameAndDuration(List<Employee> empList) {
//		for(Employee ee: empList) {
//			int diff = LocalDate.now().getYear() - ee.getHireDate().getYear();
//			System.out.println(diff);
//		}
		
//		Integer todayDays = LocalDate.now().getDayOfYear();
//		empList.stream()
//		.map((e)->todayDays - e.getHireDate().getDayOfYear())
//		.forEach(System.out::println);
		
		LocalDate date = LocalDate.now();
		
		empList.stream()
		.map((e)-> "The difference is: "+Period.between(date, e.getHireDate()))
		.forEach(System.out::println);
		
//		List<Employee> daysAndDuration = empList.stream()
//		.map((e)->{
//			LocalDate date = e.getHireDate();
//			LocalDate currentDate = LocalDate.now();
//			Period diff = currentDate.until(date);
//			int months = diff.getMonths();
//			int days = diff.getDays();
//		})
		
	}

	public static void empWithoutDept(List<Employee> empList) {
		List<Employee> noDept = empList.stream().filter((e) -> e.getDepartment() == null).collect(Collectors.toList());

		System.out.println("The employee with no department is: ");
		for (Employee dep : noDept) {
			System.out.println(dep.getFirstName() + " " + dep.getLastName());
		}

	}

	public static void empDetails(List<Employee> empList) {
		System.out.println("The employee details is: ");
		empList.stream().map(e -> e.getFirstName() + " " + e.getLastName() + " " + e.getHireDate() + " "
				+ e.getHireDate().getDayOfWeek()).forEach(System.out::println);

	}

	public static void empStartOnFriday(List<Employee> empList) {
		System.out.println("The employee starting on friday is: ");
		empList.stream().filter(e -> String.valueOf(e.getHireDate().getDayOfWeek()).equals("FRIDAY"))
				.map(e -> e.getFirstName() + " " + e.getLastName() + " " + e.getHireDate() + " "
						+ e.getHireDate().getDayOfWeek())
				.forEach(System.out::println);

	}

	public static void employeeReporting(List<Employee> empList) {
		for (Employee emp : empList) {
			if (emp.getManagerId() == null) {
				continue;
			} else {
				System.out.println(emp.getFirstName() + " will report to " + emp.getManagerId());
			}

		}

	}

	public static void employeeNotReporting(List<Employee> empList) {
		System.out.println("Employee not reporting to anyone are: ");
		for (Employee emp : empList) {
			if (emp.getManagerId() == null) {
				System.out.println(emp.getFirstName());
			} else {
				continue;
			}

		}

	}

	public static void sortByEmpId(List<Employee> empList) {
		System.out.println("Employee sorted by id are: ");
		empList.stream().sorted((e1, e2) -> e1.getEmployeeId().compareTo(e2.getEmployeeId()))
				.map(e -> e.getEmployeeId()).forEach(System.out::println);
	}

	public static void sortByDeptId(List<Employee> empList) {
		System.out.println("Employee sorted by Dept are: ");
		empList.stream().filter((e) -> e.getDepartment() != null).sorted((e1, e2) -> Integer
				.valueOf(e1.getDepartment().getDepartmentId()).compareTo(e2.getDepartment().getDepartmentId()))
				.forEach(System.out::println);
	}

	public static void sortByName(List<Employee> empList) {
		System.out.println("The employee sorted by first name: ");
		empList.stream().sorted((e1, e2) -> Integer.valueOf(e1.getFirstName().compareTo(e2.getFirstName())))
				.forEach(System.out::println);
	}

	public static void increaseSalary(List<Employee> empList) {
		// double increement = (15/100) * number;

		empList.stream().map(e -> e.getFirstName() + " " + e.getSalary()+" increased "+((e.getSalary() * 0.15)+e.getSalary()))
				.forEach(System.out::println);
	}
	public static void deptWithHighestCount(List<Employee> empList) {
//		Map<Department, Long> employeeCountByDept = empList.stream()
//				.filter(e->e.getDepartment()!=null)
//				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		
//		Map<String, Integer> depHighest = new HashMap<String, Integer>();
//
//		for(Map.Entry emp : employeeCountByDept.entrySet()) {
//			if(depHighest.containsKey(emp.getKey())) {
//				depHighest.put((String) emp.getKey(), Integer.parseInt((String) emp.getValue())+1);
//				
//			}
//			else {
//				depHighest.put((String) emp.getKey(), (Integer)emp.getValue());
//			}
//		}
//		
//		for(Map.Entry data:depHighest.entrySet()) {
//			System.out.println(data.getKey()+" "+data.getValue());
//			
//		}
//		
		Map<Department, Long> empCount = empList.stream()
									.filter(e->e.getDepartment()!=null)
									.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		for(Map.Entry<Department, Long> emp : empCount.entrySet()) {
			Department dept = (Department) emp.getKey();
			System.out.println(dept.getDepartmentName()+": "+emp.getValue());
		}
		System.out.println("Dept with higest count of employee is: ");
		System.out.println("=========");
		HashMap<Department, Long> e = new HashMap<>(empCount);
		for(Map.Entry<Department, Long> emp : e.entrySet()) {
			Department dept = (Department) emp.getKey();
			System.out.println(dept.getDepartmentName()+": "+emp.getValue());
		}
		
		Map.Entry<Department, Long> maxEntry = null;

		for (Map.Entry<Department, Long> entry : e.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }

		}
		
		System.out.println("--------------try------------");
		Department dep = empCount.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
		System.out.println(dep.getDepartmentId()+":"+dep.getDepartmentName());
		
//		List<String> g 
//        = Arrays.asList("geeks", "for", "geeks"); 
//
//    // Collect the list as map 
    // by groupingBy() method 
//    Map<String, Long> result 
//        = g.stream().collect( 
//            Collectors.groupingBy( 
//                Function.identity(), 
//                Collectors.counting())); 
//
//    // Print the result 
//    System.out.println(result); 
//    String maxKey = Collections.max(result.keySet()); 
//    System.out.println("Max is: "+maxKey);
//		
//	System.out.println(empCount);
		
		
		
	}
}
