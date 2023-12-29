package withDesignPattern.Strategy.quackBehaviour;

public class Quack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("I quack");
	}

}
