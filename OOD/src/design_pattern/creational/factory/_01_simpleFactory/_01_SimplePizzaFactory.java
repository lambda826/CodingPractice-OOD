package design_pattern.creational.factory._01_simpleFactory;

import design_pattern.creational.factory._01_simpleFactory.pizza.CheesePizza;
import design_pattern.creational.factory._01_simpleFactory.pizza.ClamPizza;
import design_pattern.creational.factory._01_simpleFactory.pizza.PepperoniPizza;
import design_pattern.creational.factory._01_simpleFactory.pizza.Pizza;
import design_pattern.creational.factory._01_simpleFactory.pizza.VeggiePizza;

public class _01_SimplePizzaFactory {

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
