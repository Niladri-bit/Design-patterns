package store;

import coffee.BlackTea;
import coffee.Coffee;
import coffee.ColdCoffee;
import coffee.Espresso;
import coffeeDecorator.Milk;
import coffeeDecorator.Sugar;
import coffeeDecorator.Whip;

public class StarbucksCoffeeStore {
	public static void main(String args[]) {
		 Coffee coffee = new Espresso();
		 System.out.println(coffee.getDescription()
		 + " $" + coffee.cost());
		 Coffee coffee2 = new ColdCoffee();
		 coffee2 = new Milk(coffee2);
		 coffee2 = new Sugar(coffee2);
		 coffee2 = new Sugar(coffee2);
		 System.out.println(coffee2.getDescription()
		 + " $" + coffee2.cost());
		 Coffee coffee3 = new BlackTea();
		 coffee3 = new Sugar(coffee3);
		 coffee3 = new Sugar(coffee3);
		 coffee3 = new Whip(coffee3);
		 System.out.println(coffee3.getDescription()
		 +  "$" + coffee3.cost());
		 }
}
