package design_pattern.structural.adapter.ducks;

public class _02_MallardDuck implements _01_Duck {
    
	public void quack() {
		System.out.println("Quack");
	}
 
	public void fly() {
		System.out.println("I'm flying");
	}
	
}
