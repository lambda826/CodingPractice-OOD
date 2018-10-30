package design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory;

import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.BlackOlives;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.CheeseMozzarella;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.ClamsFrozen;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.DoughThickCrust;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.Eggplant;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.PepperoniSliced;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.SaucePlumTomato;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.Spinach;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Cheese;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Clams;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Dough;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Pepperoni;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Sauce;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Veggies;

public class Chicago_Pizza_Ingredient_ConcreteFactory implements _00_Pizza_Ingredient_AbstractFactory {

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
