package factory;

import employee.Employee;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}
}
