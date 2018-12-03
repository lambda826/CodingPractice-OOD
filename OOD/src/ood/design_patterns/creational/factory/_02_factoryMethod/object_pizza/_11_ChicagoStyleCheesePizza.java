package ood.design_patterns.creational.factory._02_factoryMethod.object_pizza;

public class _11_ChicagoStyleCheesePizza extends _00_Pizza {

    public _11_ChicagoStyleCheesePizza() {

        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
