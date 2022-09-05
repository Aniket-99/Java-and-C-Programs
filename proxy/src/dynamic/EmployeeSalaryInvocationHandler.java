package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import dto.ITEmployee;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {

	private ITEmployee employeeTarget;

	public EmployeeSalaryInvocationHandler(ITEmployee employeeTarget) {
		this.employeeTarget = employeeTarget;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.getName().equals("giveHike")) {
			double hikeVal = (double) args[0];

			if (hikeVal <= 0) {
				throw new RuntimeException("Hike value is not valid");
			}
		}

		Object returnType = method.invoke(employeeTarget, args);

		System.out.println("Executing method: " + method.getName() + " for employee id " + employeeTarget.getId());

		return returnType;
	}

}
