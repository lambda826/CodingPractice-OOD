package design_pattern.behavioral.template._02_barista;

public class BeverageTestDrive {
    public static void main(String[] args) {

        //		Tea tea = new Tea();
        //		Coffee coffee = new Coffee();
        // 
        //		System.out.println("\nMaking tea...");
        //		tea.prepareRecipe();
        // 
        //		System.out.println("\nMaking coffee...");
        //		coffee.prepareRecipe();

        WithHookCaffeineBeverage teaHook = new WithHookTea();
        WithHookCaffeineBeverage coffeeHook = new WithHookCoffee();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
