package coffeeDecorator;

import coffee.Coffee;

public class Sugar extends CoffeeDecorator{
	
	public Coffee coffee;
	
	public Sugar(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Sugar";
	}

	@Override
	public double cost() {
		
		return 0.25 + coffee.cost();
	}

}
