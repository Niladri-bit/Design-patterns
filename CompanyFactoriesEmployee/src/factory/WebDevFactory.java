package factory;

import employee.AndroidDeveloper;
import employee.Employee;

public class WebDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
