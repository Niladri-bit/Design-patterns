package employee;

public class BackendDeveloper implements Employee {

	@Override
	public int getSalary() {
		return 70000;
	}

	@Override
	public String getName() {
		return "I am a backend developer";
	}

}
