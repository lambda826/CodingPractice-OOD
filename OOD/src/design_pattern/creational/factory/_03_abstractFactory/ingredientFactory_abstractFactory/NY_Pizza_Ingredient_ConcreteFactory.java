package design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory;

import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.CheeseReggiano;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.ClamsFresh;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.DoughThinCrust;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.Garlic;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.Mushroom;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.Onion;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.PepperoniSliced;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.RedPepper;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.SauceMarinara;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Cheese;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Clams;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Dough;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Pepperoni;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Sauce;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Veggies;

public class NY_Pizza_Ingredient_ConcreteFactory implements _00_Pizza_Ingredient_AbstractFactory {

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
