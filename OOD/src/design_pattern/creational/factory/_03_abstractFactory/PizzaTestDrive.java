package design_pattern.creational.factory._03_abstractFactory;

import design_pattern.creational.factory._03_abstractFactory.pizzaStore_factoryMethod.ChicagoPizzaStore;
import design_pattern.creational.factory._03_abstractFactory.pizzaStore_factoryMethod.NYPizzaStore;
import design_pattern.creational.factory._03_abstractFactory.pizzaStore_factoryMethod._00_PizzaStore;
import design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory._00_Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        
        _00_PizzaStore nyStore = new NYPizzaStore();
        _00_PizzaStore chicagoStore = new ChicagoPizzaStore();

        _00_Pizza pizza = nyStore.orderPizza("cheese");
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
