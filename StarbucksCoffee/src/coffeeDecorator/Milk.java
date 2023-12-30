package coffeeDecorator;

import coffee.Coffee;

public class Milk extends CoffeeDecorator{
	
	public Coffee coffee;
	
	public Milk(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		
		return 1.00 + coffee.cost();
	}

}
