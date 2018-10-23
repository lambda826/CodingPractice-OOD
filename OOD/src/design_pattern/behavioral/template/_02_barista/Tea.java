package design_pattern.behavioral.template._02_barista;

public class Tea extends CaffeineBeverage {
    
	public void brew() {
		System.out.println("Steeping the tea");
	}
	
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
}
