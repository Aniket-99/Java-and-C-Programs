package com.stream.practice;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private String mgrName, deptNo;

	public Employee(int empId, String name, double salary, String mgrName, String deptNo) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.mgrName = mgrName;
		this.deptNo = deptNo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMgrName() {
		return mgrName;
	}

	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

}
