package employee;

public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		return 50000;
	}

	@Override
	public String getName() {
		return "I am Android Developer";
	}

}
