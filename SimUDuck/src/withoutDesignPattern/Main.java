package withoutDesignPattern;

public class Main {
	public static void main(String[] args) {
		
		Duck d1 =  new MallardDuck() ;
		d1.display();
		
		Duck d2=new RubberDuck();
		d2.walk();
		//Issue1:- as we have added walk in parent class ,
		//         all subclass inherits the walk property which it should not.
		
		
	}
}
