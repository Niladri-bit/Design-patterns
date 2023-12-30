package client;

import employee.Employee;
import factory.AndroidDevFactory;
import factory.EmployeeFactory;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		System.out.println(e1.getName());
		System.out.println("My salary is "+e1.getSalary());
	}

}
