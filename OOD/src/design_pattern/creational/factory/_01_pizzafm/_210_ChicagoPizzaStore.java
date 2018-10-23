package design_pattern.creational.factory._01_pizzafm;

public class _210_ChicagoPizzaStore extends _200_PizzaStore {

    _100_Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new _111_ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new _114_ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new _112_ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new _113_ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
