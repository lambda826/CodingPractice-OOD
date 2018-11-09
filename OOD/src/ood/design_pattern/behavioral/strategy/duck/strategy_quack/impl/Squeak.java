package ood.design_pattern.behavioral.strategy.duck.strategy_quack.impl;

import ood.design_pattern.behavioral.strategy.duck.strategy_quack.IQuackBehavior;

public class Squeak implements IQuackBehavior {

    public void quack() {
        System.out.println("Squeak");
    }

}