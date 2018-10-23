package design_pattern.creational.factory._01_pizzafm;

public class _220_NYPizzaStore extends _200_PizzaStore {

    _100_Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new _121_NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new _124_NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new _122_NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new _123_NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
