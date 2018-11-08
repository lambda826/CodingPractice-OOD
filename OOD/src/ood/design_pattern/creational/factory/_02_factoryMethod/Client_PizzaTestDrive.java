package ood.design_pattern.creational.factory._02_factoryMethod;

import ood.design_pattern.creational.factory._02_factoryMethod.factory_pizzaStore.ChicagoPizzaStore_ConcreteFactory;
import ood.design_pattern.creational.factory._02_factoryMethod.factory_pizzaStore.NYPizzaStore_ConcreteFactory;
import ood.design_pattern.creational.factory._02_factoryMethod.factory_pizzaStore._PizzaStore_AbsctractFactory;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._00_Pizza;

public class Client_PizzaTestDrive {

    public static void main(String[] args) {
        
        _PizzaStore_AbsctractFactory nyStore = new NYPizzaStore_ConcreteFactory();
        _PizzaStore_AbsctractFactory chicagoStore = new ChicagoPizzaStore_ConcreteFactory();

        _00_Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
