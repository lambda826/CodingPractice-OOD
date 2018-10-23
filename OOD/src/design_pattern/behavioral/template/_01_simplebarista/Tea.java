package design_pattern.behavioral.template._01_simplebarista;

public class Tea {
 
	void prepareRecipe() {
	    
        // Same
		boilWater();
		
		// Different
		steepTeaBag();
		
        // Same
		pourInCup();
		
		// Different
		addLemon();
	}
 
	public void boilWater() {
		System.out.println("Boiling water");
	}
 
	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}
 
	public void addLemon() {
		System.out.println("Adding Lemon");
	}
 
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
