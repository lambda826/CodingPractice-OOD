package ood.design_patterns.structural.adapter.ducks;

import java.util.Random;

public class _07_DuckAdapter implements _03_ITurkey {

    _01_IDuck duck;
    Random rand;

    public _07_DuckAdapter(_01_IDuck duck) {
        this.duck = duck;
        rand = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
