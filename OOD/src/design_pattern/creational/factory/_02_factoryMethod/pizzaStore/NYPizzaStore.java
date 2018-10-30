package design_pattern.creational.factory._02_factoryMethod.pizzaStore;

import design_pattern.creational.factory._02_factoryMethod.pizza._00_Pizza;
import design_pattern.creational.factory._02_factoryMethod.pizza._21_NYStyleCheesePizza;
import design_pattern.creational.factory._02_factoryMethod.pizza._23_NYStyleClamPizza;
import design_pattern.creational.factory._02_factoryMethod.pizza._24_NYStylePepperoniPizza;
import design_pattern.creational.factory._02_factoryMethod.pizza._22_NYStyleVeggiePizza;

public class NYPizzaStore extends _00_PizzaStore {

    _00_Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new _21_NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new _22_NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new _23_NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new _24_NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
