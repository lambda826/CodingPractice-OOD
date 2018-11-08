package ood.design_pattern.creational.factory._03_abstractFactory.pizzaStore_factoryMethod;

import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.Chicago_Pizza_Ingredient_ConcreteFactory;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory._Pizza_Ingredient_AbstractFactory;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.CheesePizza;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.ClamPizza;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.PepperoniPizza;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.VeggiePizza;
import ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory._Pizza;

public class ChicagoPizzaStore extends _PizzaStore {

    protected _Pizza createPizza(String item) {

        _Pizza pizza = null;
        _Pizza_Ingredient_AbstractFactory ingredientFactory = new Chicago_Pizza_Ingredient_ConcreteFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
