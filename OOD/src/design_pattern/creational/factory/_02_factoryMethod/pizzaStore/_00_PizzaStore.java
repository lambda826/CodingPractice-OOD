package design_pattern.creational.factory._02_factoryMethod.pizzaStore;

import design_pattern.creational.factory._02_factoryMethod.pizza._00_Pizza;

public abstract class _00_PizzaStore {

    // Abstract method
    // Factory method
    abstract _00_Pizza createPizza(String item);
    
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
