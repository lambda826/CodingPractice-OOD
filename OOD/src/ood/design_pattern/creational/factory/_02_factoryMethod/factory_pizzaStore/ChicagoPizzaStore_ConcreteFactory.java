package ood.design_pattern.creational.factory._02_factoryMethod.factory_pizzaStore;

import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._00_Pizza;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._11_ChicagoStyleCheesePizza;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._12_ChicagoStyleVeggiePizza;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._13_ChicagoStyleClamPizza;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._14_ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore_ConcreteFactory extends _PizzaStore_AbsctractFactory {

    public _00_Pizza createPizza(String item) {
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
