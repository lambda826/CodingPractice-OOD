package ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory;

import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Cheese;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Clams;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Dough;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Pepperoni;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Sauce;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.Veggies;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.BlackOlives;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.CheeseMozzarella;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.ClamsFrozen;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.DoughThickCrust;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.Eggplant;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.PepperoniSliced;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.SaucePlumTomato;
import ood.design_patterns.creational.factory._03_abstractFactory.ingredient_AbstractFactory.ingredients.impl.Spinach;

public class Chicago_Pizza_Ingredient_ConcreteFactory implements _Pizza_Ingredient_AbstractFactory {

    public Dough createDough() {
        return new DoughThickCrust();
    }

    public Sauce createSauce() {
        return new SaucePlumTomato();
    }

    public Cheese createCheese() {
        return new CheeseMozzarella();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new PepperoniSliced();
    }

    public Clams createClam() {
        return new ClamsFrozen();
    }
}
