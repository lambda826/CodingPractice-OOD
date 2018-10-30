package design_pattern.creational.factory._02_factoryMethod.pizza;

public class _12_ChicagoStyleVeggiePizza extends _00_Pizza {
    
    public _12_ChicagoStyleVeggiePizza() {
        
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
