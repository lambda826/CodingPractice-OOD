package ood.design_patterns.behavioral.strategy.duck.strategy_quack.impl;

import ood.design_patterns.behavioral.strategy.duck.strategy_quack.IQuackBehavior;

public class FakeQuack implements IQuackBehavior {

    public void quack() {
        System.out.println("Qwak");
    }

}
