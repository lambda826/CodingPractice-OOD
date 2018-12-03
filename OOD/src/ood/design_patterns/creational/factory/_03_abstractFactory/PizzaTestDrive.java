package ood.design_patterns.creational.factory._03_abstractFactory;

import ood.design_patterns.creational.factory._03_abstractFactory.pizzaStore_factoryMethod.ChicagoPizzaStore;
import ood.design_patterns.creational.factory._03_abstractFactory.pizzaStore_factoryMethod.NYPizzaStore;
import ood.design_patterns.creational.factory._03_abstractFactory.pizzaStore_factoryMethod._PizzaStore;
import ood.design_patterns.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory._Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {

        _PizzaStore nyStore = new NYPizzaStore();
        _PizzaStore chicagoStore = new ChicagoPizzaStore();

        _Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
