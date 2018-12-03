package ood.design_patterns.creational.factory._03_abstractFactory.pizzaStore_factoryMethod;

import ood.design_patterns.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory._Pizza;

public abstract class _PizzaStore {

    // Abstract method
    // Factory method
    abstract _Pizza createPizza(String item);

    // All subclasses make use of the orderPizza() method defined n PizzaStore
    // We could make the orderPizza() method final if we really wanted to enforce this
    public final _Pizza orderPizza(String type) {
        _Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
