package dto;

import java.lang.reflect.Proxy;

import dynamic.EmployeeSalaryInvocationHandler;

public class Client {
	public static void main(String[] args) {
		ITEmployee employee = new ITEmployee();
		employee.setId(101);
		employee.setName("Aniket");
		employee.setSalary(30000);
		// employee.giveHike(-500);
		// System.out.println(employee.getSalary());

		EmployeeSalaryInvocationHandler empHandler = new EmployeeSalaryInvocationHandler(employee);

		IEmployee employeeProxy = (IEmployee) Proxy.newProxyInstance(ITEmployee.class.getClassLoader(),
				new Class[] { IEmployee.class }, empHandler);

		employeeProxy.giveHike(5000);

		System.out.println(employeeProxy.getSalary());

	}
}
