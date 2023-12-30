package coffeeDecorator;

import coffee.Coffee;

public class Whip extends CoffeeDecorator{
	
	public Coffee coffee;
	
	public Whip(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		
		return 0.50 + coffee.cost();
	}

}
