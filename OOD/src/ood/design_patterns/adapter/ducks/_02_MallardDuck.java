package ood.design_patterns.adapter.ducks;

public class _02_MallardDuck implements _01_IDuck {

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

}
