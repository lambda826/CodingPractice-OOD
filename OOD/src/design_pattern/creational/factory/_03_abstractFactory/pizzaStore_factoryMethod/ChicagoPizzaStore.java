package design_pattern.creational.factory._03_abstractFactory.pizzaStore_factoryMethod;

import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.Chicago_Pizza_Ingredient_ConcreteFactory;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory._00_Pizza_Ingredient_AbstractFactory;
import design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.CheesePizza;
import design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.ClamPizza;
import design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.PepperoniPizza;
import design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory.VeggiePizza;
import design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory._00_Pizza;

public class ChicagoPizzaStore extends _00_PizzaStore {

    protected _00_Pizza createPizza(String item) {
        
        _00_Pizza pizza = null;
        _00_Pizza_Ingredient_AbstractFactory ingredientFactory = new Chicago_Pizza_Ingredient_ConcreteFactory();

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
