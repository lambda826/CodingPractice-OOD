package design_pattern.creational.factory._02_factoryMethod;

import design_pattern.creational.factory._02_factoryMethod.pizza._00_Pizza;
import design_pattern.creational.factory._02_factoryMethod.pizzaStore._00_PizzaStore;
import design_pattern.creational.factory._02_factoryMethod.pizzaStore.ChicagoPizzaStore;
import design_pattern.creational.factory._02_factoryMethod.pizzaStore.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        _00_PizzaStore nyStore = new NYPizzaStore();
        _00_PizzaStore chicagoStore = new ChicagoPizzaStore();

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
