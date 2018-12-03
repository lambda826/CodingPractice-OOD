package ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory;

import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Cheese;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Clams;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Dough;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Pepperoni;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Sauce;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Veggies;

public interface _Pizza_Ingredient_AbstractFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
