package client;

import employee.Employee;
import employee.FullStackDeveloper;
import factory.EmployeeFactory;

public class DeveloperClient {

	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("full stack developer");
		System.out.println("Employee salary is "+employee.getSalary());
		//Employee employee2 = new FullStackDeveloper();
		//avoid tighCoupling
	}

}
