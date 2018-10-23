package design_pattern.behavioral.template.barista;

public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
	    // Common
		boilWater();
		
		brew();
		
        // Common
		pourInCup();
		
		addCondiments();
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
