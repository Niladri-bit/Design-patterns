package withDesignPattern.Strategy.Duck;

import withDesignPattern.Strategy.flybehaviour.FlyBehaviour;
import withDesignPattern.Strategy.quackBehaviour.QuackBehaviour;

public abstract class Duck {
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;
	
	public Duck() {
		
		}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	
	public void setQuackBehavior(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
}
