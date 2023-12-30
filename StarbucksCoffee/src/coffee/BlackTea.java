package coffee;

public class BlackTea extends Coffee{
	
	public BlackTea() {
		this.coffeeDescription = "Black Tea";
	}

	@Override
	public double cost() {
		return 1.00;
	}

}
