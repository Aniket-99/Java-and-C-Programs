package com.practice.eis.bean;

public class Employee {
	private int id;
	private String name, designation, insuranceScheme;
	private double salary;

	public Employee() {

	}

	public Employee(int id, String name, String designation, String insuranceScheme, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", insuranceScheme=");
		builder.append(insuranceScheme);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	

}
