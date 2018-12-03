package ood.design_patterns.behavioral.strategy.duck.strategy_quack.impl;

import ood.design_patterns.behavioral.strategy.duck.strategy_quack.IQuackBehavior;

public class Quack implements IQuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }

}
