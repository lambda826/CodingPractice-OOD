package ood.design_patterns.creational.factory._01_simpleFactory;

import ood.design_patterns.creational.factory._01_simpleFactory.pizza._Pizza;

public class _02_PizzaStore {

    _01_SimplePizzaFactory factory;

    public _02_PizzaStore(_01_SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public _Pizza orderPizza(String type) {
        _Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
