package withDesignPattern.Strategy;

import withDesignPattern.Strategy.Duck.Duck;
import withDesignPattern.Strategy.Duck.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		
	}
}
