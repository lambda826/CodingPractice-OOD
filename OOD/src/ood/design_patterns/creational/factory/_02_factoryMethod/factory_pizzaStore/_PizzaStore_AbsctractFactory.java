package ood.design_patterns.creational.factory._02_factoryMethod.factory_pizzaStore;

import ood.design_patterns.creational.factory._02_factoryMethod.object_pizza._00_Pizza;

public abstract class _PizzaStore_AbsctractFactory {

    // Abstract method
    // Factory method
    public abstract _00_Pizza createPizza(String item);

    // All subclasses make use of the orderPizza() method defined n PizzaStore
    // We could make the orderPizza() method final if we really wanted to enforce this
    public final _00_Pizza orderPizza(String type) {

        _00_Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
