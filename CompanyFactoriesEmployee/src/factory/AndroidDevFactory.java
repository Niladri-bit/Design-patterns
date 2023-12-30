package factory;

import employee.BackendDeveloper;
import employee.Employee;

public class AndroidDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new BackendDeveloper();
	}

}
