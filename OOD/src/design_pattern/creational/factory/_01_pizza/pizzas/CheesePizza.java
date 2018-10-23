package design_pattern.creational.factory._01_pizza.pizzas;

import design_pattern.creational.factory._01_pizza.Pizza;
import design_pattern.creational.factory.pizzaaf.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
