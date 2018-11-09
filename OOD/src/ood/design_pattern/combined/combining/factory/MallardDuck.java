package ood.design_pattern.combined.combining.factory;

public class MallardDuck implements Quackable {

    public void quack() {
        System.out.println("Quack");
    }

    public String toString() {
        return "Mallard Duck";
    }
}