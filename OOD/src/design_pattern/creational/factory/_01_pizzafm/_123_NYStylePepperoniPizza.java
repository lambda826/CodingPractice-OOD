package design_pattern.creational.factory._01_pizzafm;

public class _123_NYStylePepperoniPizza extends _100_Pizza {

    public _123_NYStylePepperoniPizza() {
        
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
