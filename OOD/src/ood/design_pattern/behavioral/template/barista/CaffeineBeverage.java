package ood.design_pattern.behavioral.template.barista;

public abstract class CaffeineBeverage {

    // Declared final because we don’t want our subclasses to be able to override this method and change the recipe!
    final void prepareRecipe() {
        
        // Common
        boilWater();

        brew();

        // Common
        pourInCup();

        addCondiments();
    }

    // Because Coffee and Tea handle these methods in different ways they’re going to have to be declared as abstract. 
    // Let the subclasses worry about that stuff!
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
