package ood.design_patterns.creational.factory._01_simpleFactory.pizza;

public class ClamPizza extends _Pizza {
    
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
