package withoutDesignPattern;

public abstract class Duck {

	public void swim() {
		System.out.println("I swim");
	}
	
	public void walk() {
		System.out.println("I can walk");
	}
	
	public abstract void display();
}
