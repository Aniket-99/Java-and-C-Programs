package com.practice.eis.service;

import com.practice.eis.bean.Employee;

public interface EmployeeService {
	void getEmployeeDetails(Employee e);

	String findInsuranceScheme(String designation, double salary);

	void displayDetails();
}
