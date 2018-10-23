package design_pattern.creational.factory._01_pizzafm;

public abstract class _200_PizzaStore {

    // abstract method
    abstract _100_Pizza createPizza(String item);
    
    // All subclasses make use of the orderPizza() method defined n PizzaStore
    // We could make the orderPizza() method final if we really wanted to enforce this
    public _100_Pizza orderPizza(String type) {
        _100_Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
