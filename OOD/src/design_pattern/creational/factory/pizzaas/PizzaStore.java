package design_pattern.creational.factory.pizzaas;

import design_pattern.creational.factory._01_pizza._010_SimplePizzaFactory;

public class PizzaStore {
    _010_SimplePizzaFactory factory;

    public PizzaStore(_010_SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
