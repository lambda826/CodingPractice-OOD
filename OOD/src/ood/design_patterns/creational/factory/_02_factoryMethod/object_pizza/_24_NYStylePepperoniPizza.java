package ood.design_patterns.creational.factory._02_factoryMethod.object_pizza;

public class _24_NYStylePepperoniPizza extends _00_Pizza {

    public _24_NYStylePepperoniPizza() {

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
