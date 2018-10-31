package design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory;

import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory._00_Pizza_Ingredient_AbstractFactory;

public class PepperoniPizza extends _00_Pizza {

    _00_Pizza_Ingredient_AbstractFactory ingredientFactory;

    public PepperoniPizza(_00_Pizza_Ingredient_AbstractFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
