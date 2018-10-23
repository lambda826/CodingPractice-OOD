package design_pattern.creational.factory._01_pizza;

public abstract class _020_PizzaStore {

    // abstract method
    protected abstract Pizza createPizza(String item);

    // All subclasses make use of the orderPizza() method defined n PizzaStore
    // We could make the orderPizza() method final if we really wanted to enforce this
    public final Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
