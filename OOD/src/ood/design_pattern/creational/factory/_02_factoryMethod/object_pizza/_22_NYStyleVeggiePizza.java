package ood.design_pattern.creational.factory._02_factoryMethod.object_pizza;

public class _22_NYStyleVeggiePizza extends _00_Pizza {

    public _22_NYStyleVeggiePizza() {

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
