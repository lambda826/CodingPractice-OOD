package design_pattern.creational.factory._02_factoryMethod.pizzaStore;

import design_pattern.creational.factory._02_factoryMethod.pizza._00_Pizza;
import design_pattern.creational.factory._02_factoryMethod.pizza._11_ChicagoStyleCheesePizza;
import design_pattern.creational.factory._02_factoryMethod.pizza._13_ChicagoStyleClamPizza;
import design_pattern.creational.factory._02_factoryMethod.pizza._14_ChicagoStylePepperoniPizza;
import design_pattern.creational.factory._02_factoryMethod.pizza._12_ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends _00_PizzaStore {

    _00_Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new _11_ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new _12_ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new _13_ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new _14_ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
