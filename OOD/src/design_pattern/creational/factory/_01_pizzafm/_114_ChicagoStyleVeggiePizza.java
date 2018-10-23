package design_pattern.creational.factory._01_pizzafm;

public class _114_ChicagoStyleVeggiePizza extends _100_Pizza {
    
    public _114_ChicagoStyleVeggiePizza() {
        
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
