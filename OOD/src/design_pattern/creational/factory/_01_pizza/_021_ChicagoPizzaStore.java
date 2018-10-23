package design_pattern.creational.factory._01_pizza;

import design_pattern.creational.factory._01_pizza.pizzas.CheesePizza;
import design_pattern.creational.factory._01_pizza.pizzas.ClamPizza;
import design_pattern.creational.factory._01_pizza.pizzas.PepperoniPizza;
import design_pattern.creational.factory._01_pizza.pizzas.VeggiePizza;
import design_pattern.creational.factory.pizzaaf.ChicagoPizzaIngredientFactory;
import design_pattern.creational.factory.pizzaaf.PizzaIngredientFactory;

public class _021_ChicagoPizzaStore extends _020_PizzaStore {

    protected Pizza createPizza(String item) {
        
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
