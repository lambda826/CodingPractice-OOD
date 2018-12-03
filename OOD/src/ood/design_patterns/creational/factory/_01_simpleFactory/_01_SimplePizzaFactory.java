package ood.design_patterns.creational.factory._01_simpleFactory;

import ood.design_patterns.creational.factory._01_simpleFactory.pizza.CheesePizza;
import ood.design_patterns.creational.factory._01_simpleFactory.pizza.ClamPizza;
import ood.design_patterns.creational.factory._01_simpleFactory.pizza.PepperoniPizza;
import ood.design_patterns.creational.factory._01_simpleFactory.pizza.VeggiePizza;
import ood.design_patterns.creational.factory._01_simpleFactory.pizza._Pizza;

public class _01_SimplePizzaFactory {

    public _Pizza createPizza(String type) {

        _Pizza pizza = null;

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
