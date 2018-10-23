package design_pattern.creational.factory._01_pizzafm;

public class _111_ChicagoStyleCheesePizza extends _100_Pizza {

    public _111_ChicagoStyleCheesePizza() {
        
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
