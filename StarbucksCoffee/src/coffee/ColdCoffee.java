package coffee;

public class ColdCoffee extends Coffee{
	
	public ColdCoffee() {
		this.coffeeDescription = "Cold Coffee";
	}

	@Override
	public double cost() {
		return 2.00;
	}

}
