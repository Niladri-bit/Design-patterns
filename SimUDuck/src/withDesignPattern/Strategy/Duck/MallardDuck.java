package withDesignPattern.Strategy.Duck;

import withDesignPattern.Strategy.flybehaviour.FlyWithWings;
import withDesignPattern.Strategy.quackBehaviour.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am MallardDuck");
		
	}

}
