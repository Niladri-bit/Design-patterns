package withoutDesignPattern;

public class MallardDuck extends Duck implements flyable,quackable {

	@Override
	public void display() {
		System.out.println("I look like a mallard duck");
		
	}

	@Override
	public void fly() {
		System.out.println("I can fly");
		
	}
	//issue2:- every class should implement their own fly behaviour
	//         avoids code reusability
	//         there can be more than 1 type of flying behaviour

	@Override
	public void quack() {
		System.out.println("I can quack");
	}

}
