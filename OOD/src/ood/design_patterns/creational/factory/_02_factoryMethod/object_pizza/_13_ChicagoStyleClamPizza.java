package ood.design_patterns.creational.factory._02_factoryMethod.object_pizza;

public class _13_ChicagoStyleClamPizza extends _00_Pizza {

    public _13_ChicagoStyleClamPizza() {

        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
