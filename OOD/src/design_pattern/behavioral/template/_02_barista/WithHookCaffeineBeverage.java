package design_pattern.behavioral.template._02_barista;

public abstract class WithHookCaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Here we’ve defined a method with a (mostly) empty default implementation.
    // This method just returns true and does nothing else.
    // This is a hook because the subclass can override this method, but doesn’t have to.
    boolean customerWantsCondiments() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return true;
    }
}
