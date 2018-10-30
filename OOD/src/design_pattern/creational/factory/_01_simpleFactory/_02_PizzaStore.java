package design_pattern.creational.factory._01_simpleFactory;

import design_pattern.creational.factory._01_simpleFactory.pizza.Pizza;

public class _02_PizzaStore {

    _01_SimplePizzaFactory factory;

    public _02_PizzaStore(_01_SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
