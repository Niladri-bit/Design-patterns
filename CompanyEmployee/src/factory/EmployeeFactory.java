package factory;

import employee.AndroidDeveloper;
import employee.Employee;
import employee.FrontendDeveloper;
import employee.FullStackDeveloper;

public class EmployeeFactory {
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
			return new AndroidDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("FULL STACK DEVELOPER")) {
			return new FullStackDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("BACKEND DEVELOPER")) {
			return new FullStackDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("FRONTEND DEVELOPER")) {
			return new FrontendDeveloper();
		}
		else {
			return null;
		}
		
	}
}
