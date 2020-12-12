package com.labexercise.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Employee2 {
	private int empid;
	private String empName;
	private Double empSalary;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

}
@FunctionalInterface
interface MyInterface{
	void display();
}

public class MethodReference {
	
	public void myMethod() {
		System.out.println("Instance method");
	}
	
	
	public static void main(String[] args) {
		
		Employee2 emp = new Employee2();
		
		Consumer<Integer> id = emp::setEmpid;
		id.accept(1234);
		
		Consumer<String> name = emp::setEmpName;
		name.accept("Aniket");
		
		Consumer<Double> salary = emp::setEmpSalary;
		salary.accept(500.09d);
		
		Supplier<Integer> s1 = emp::getEmpid;
		int id1 = s1.get();
		
		Supplier<String> s2 = emp::getEmpName;
		String name1 = s2.get();
		
		Supplier<Double> s3 = emp::getEmpSalary;
		double salary1 = s3.get();
		
		
		System.out.println(id1+"\n"+name1+"\n"+salary1);
	}

}
