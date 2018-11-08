package ood.design_pattern.creational.factory._03_abstractFactory.pizzasProduct_holdAbstractFactory;

import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory._Pizza_Ingredient_AbstractFactory;

public class PepperoniPizza extends _Pizza {

    public PepperoniPizza(_Pizza_Ingredient_AbstractFactory ingredientFactory) {
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
