package ood.design_patterns.structural.adapter.ducks;

public class _06_DuckTestDrive {

    public static void main(String[] args) {
        _02_MallardDuck duck = new _02_MallardDuck();
        _04_WildTurkey turkey = new _04_WildTurkey();

        // Wrap the turkey in a TurkeyAdapter, which makes it look like a Duck
        _01_IDuck turkeyAdapter = new _05_TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        // We try to pass off the turkey as a duck
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(_01_IDuck duck) {
        duck.quack();
        duck.fly();
    }
}
