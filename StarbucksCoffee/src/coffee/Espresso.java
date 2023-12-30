package coffee;

public class Espresso extends Coffee{
	
	public Espresso() {
		this.coffeeDescription = "Espresso";
	}

	@Override
	public double cost() {
		return 1.90;
	}
	

}
