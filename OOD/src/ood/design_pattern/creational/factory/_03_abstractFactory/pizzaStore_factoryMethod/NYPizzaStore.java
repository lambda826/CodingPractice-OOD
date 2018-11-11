package ood.design_pattern.creational.factory._03_abstractFactory.pizzaStore_factoryMethod;

import java.util.Arrays;

import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.NY_Pizza_Ingredient_ConcreteFactory;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory._Pizza_Ingredient_AbstractFactory;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.CheesePizza;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.ClamPizza;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.PepperoniPizza;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.VeggiePizza;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory._Pizza;

public class NYPizzaStore extends _PizzaStore {

    protected _Pizza createPizza(String item) {

        _Pizza pizza = null;
        _Pizza_Ingredient_AbstractFactory ingredientFactory = new NY_Pizza_Ingredient_ConcreteFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }

    public static void main(String[] args) {
        int x = 0;
        int[] p = new int[] { ++x, ++x };
        System.out.println(Arrays.toString(p));
    }
}
