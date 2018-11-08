package ood.design_pattern.creational.factory._02_factoryMethod.factory_pizzaStore;

import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._00_Pizza;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._21_NYStyleCheesePizza;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._22_NYStyleVeggiePizza;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._23_NYStyleClamPizza;
import ood.design_pattern.creational.factory._02_factoryMethod.object_pizza._24_NYStylePepperoniPizza;

public class NYPizzaStore_ConcreteFactory extends _PizzaStore_AbsctractFactory {

    public _00_Pizza createPizza(String item) {
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
