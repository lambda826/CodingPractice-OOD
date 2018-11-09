package ood.design_pattern.creational.factory._01_simpleFactory.pizza;

public class CheesePizza extends _Pizza {
    
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}