package design_pattern.creational.factory.pizzaaf;

import design_pattern.creational.factory._01_pizza.Pizza;
import design_pattern.creational.factory._01_pizza._020_PizzaStore;
import design_pattern.creational.factory._01_pizza._021_ChicagoPizzaStore;
import design_pattern.creational.factory._01_pizza._022_NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        _020_PizzaStore nyStore = new _022_NYPizzaStore();
        _020_PizzaStore chicagoStore = new _021_ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
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
