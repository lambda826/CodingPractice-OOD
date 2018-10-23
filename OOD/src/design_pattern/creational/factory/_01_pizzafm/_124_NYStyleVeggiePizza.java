package design_pattern.creational.factory._01_pizzafm;

public class _124_NYStyleVeggiePizza extends _100_Pizza {

    public _124_NYStyleVeggiePizza() {
        
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
