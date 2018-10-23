package design_pattern.creational.factory._01_pizza;

import design_pattern.creational.factory.pizzaas.CheesePizza;
import design_pattern.creational.factory.pizzaas.ClamPizza;
import design_pattern.creational.factory.pizzaas.PepperoniPizza;
import design_pattern.creational.factory.pizzaas.Pizza;
import design_pattern.creational.factory.pizzaas.VeggiePizza;

public class _010_SimplePizzaFactory {

    public Pizza createPizza(String type) {
        
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
