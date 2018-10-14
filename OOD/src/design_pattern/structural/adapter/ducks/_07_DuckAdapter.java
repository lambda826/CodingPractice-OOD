package design_pattern.structural.adapter.ducks;
import java.util.Random;

public class _07_DuckAdapter implements _03_Turkey {
    
	_01_Duck duck;
	Random rand;
 
	public _07_DuckAdapter(_01_Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		if (rand.nextInt(5)  == 0) {
		     duck.fly();
		}
	}
}
