package design_pattern.creational.factory.pizzaas;

import design_pattern.creational.factory._01_pizza._010_SimplePizzaFactory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        _010_SimplePizzaFactory factory = new _010_SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
