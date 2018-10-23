package design_pattern.creational.factory._01_pizzafm;

public class _300_DependentPizzaStore {

    public _100_Pizza createPizza(String style, String type) {
        _100_Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new _121_NYStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new _124_NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new _122_NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new _123_NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new _111_ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new _114_ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new _112_ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new _113_ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
