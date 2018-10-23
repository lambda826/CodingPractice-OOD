package design_pattern.behavioral.template._01_simplebarista;

public class Coffee {
 
	void prepareRecipe() {
	    
        // Same
		boilWater();
		
		// Different
		brewCoffeeGrinds();
		
		// Same
		pourInCup();
		
		// Different
		addSugarAndMilk();
	}
 
	public void boilWater() {
		System.out.println("Boiling water");
	}
 
	public void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee through filter");
	}
 
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}
}
