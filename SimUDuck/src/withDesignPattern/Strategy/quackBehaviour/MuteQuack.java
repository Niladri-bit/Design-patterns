package withDesignPattern.Strategy.quackBehaviour;

public class MuteQuack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("I can't quack");
		
	}

}
