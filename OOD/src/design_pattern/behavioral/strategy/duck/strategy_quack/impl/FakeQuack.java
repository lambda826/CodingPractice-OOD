package design_pattern.behavioral.strategy.duck.strategy_quack.impl;

import design_pattern.behavioral.strategy.duck.strategy_quack.IQuackBehavior;

public class FakeQuack implements IQuackBehavior {

    public void quack() {
        System.out.println("Qwak");
    }

}
