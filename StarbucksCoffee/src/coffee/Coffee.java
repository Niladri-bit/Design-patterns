package coffee;

public abstract class Coffee {
	public String coffeeDescription = "Coffee";
	
	public String getDescription() {
		return this.coffeeDescription;
	}
	
	public abstract double cost();
}
