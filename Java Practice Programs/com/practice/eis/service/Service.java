package com.practice.eis.service;

import com.practice.eis.bean.Employee;;

public class Service implements EmployeeService {
	Employee employee;
	public Service() {

	}
	@Override
	public void getEmployeeDetails(Employee employee) {
		this.employee = employee;
		System.out.println(employee);
		//findInsuranceScheme(employee.getDesignation(), employee.getSalary());
		
	}
	@Override
	public String findInsuranceScheme(String designation, double salary) {
		if(designation.equals("Manager") && salary > 40000) {
			employee.setInsuranceScheme("Health insurance only");
			return employee.getInsuranceScheme().toString();
		}
		else if(designation.equals("Team Leader") && (salary < 40000 && salary > 20000)){
			employee.setInsuranceScheme("Car insurance only");
			return employee.getInsuranceScheme().toString();
		}
		else {
			employee.setInsuranceScheme("All insurance covered");
			return employee.getInsuranceScheme().toString();
		}
	}
	@Override
	public void displayDetails() {
		System.out.println(employee.getId()+"\n"+employee.getName()+"\n"+employee.getSalary()+"\n"+employee.getDesignation());
		
	}


}
