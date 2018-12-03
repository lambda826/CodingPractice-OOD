package ood.design_patterns.combined.combining.adapter;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}
