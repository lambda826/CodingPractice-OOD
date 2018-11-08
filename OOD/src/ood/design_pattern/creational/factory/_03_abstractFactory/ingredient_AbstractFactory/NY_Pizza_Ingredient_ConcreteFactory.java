package ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory;

import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Cheese;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Clams;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Dough;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Pepperoni;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Sauce;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Veggies;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.CheeseReggiano;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.ClamsFresh;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.DoughThinCrust;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.Garlic;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.Mushroom;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.Onion;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.PepperoniSliced;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.RedPepper;
import ood.design_pattern.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.SauceMarinara;

public class NY_Pizza_Ingredient_ConcreteFactory implements _Pizza_Ingredient_AbstractFactory {

    public Dough createDough() {
        return new DoughThinCrust();
    }

    public Sauce createSauce() {
        return new SauceMarinara();
    }

    public Cheese createCheese() {
        return new CheeseReggiano();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new PepperoniSliced();
    }

    public Clams createClam() {
        return new ClamsFresh();
    }
}
