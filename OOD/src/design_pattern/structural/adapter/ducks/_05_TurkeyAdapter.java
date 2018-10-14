package design_pattern.structural.adapter.ducks;

// Adapter
// First, you need to implement the interface of the type you’re adapting to
public class _05_TurkeyAdapter implements _01_Duck {
    
    // Next, we need to get a reference to the object that we are adapting;
	_03_Turkey turkey;
 
	public _05_TurkeyAdapter(_03_Turkey turkey) {
		this.turkey = turkey;
	}
    
	// Now we need to implement all the methods in the interface;
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
