package design_pattern.creational.factory._01_pizzafm;

public class _112_ChicagoStyleClamPizza extends _100_Pizza {
    
    public _112_ChicagoStyleClamPizza() {
        
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
