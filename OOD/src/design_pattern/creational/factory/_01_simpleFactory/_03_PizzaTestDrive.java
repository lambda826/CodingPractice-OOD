package design_pattern.creational.factory._01_simpleFactory;

import design_pattern.creational.factory._01_simpleFactory.pizza.Pizza;

public class _03_PizzaTestDrive {

    public static void main(String[] args) {
        _01_SimplePizzaFactory factory = new _01_SimplePizzaFactory();
        _02_PizzaStore store = new _02_PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
