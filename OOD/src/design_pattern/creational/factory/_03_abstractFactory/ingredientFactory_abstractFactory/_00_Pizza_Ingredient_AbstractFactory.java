package design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory;

import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Cheese;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Clams;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Dough;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Pepperoni;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Sauce;
import design_pattern.creational.factory._03_abstractFactory.ingredientFactory_abstractFactory.ingredients.interfaces.Veggies;

public interface _00_Pizza_Ingredient_AbstractFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
