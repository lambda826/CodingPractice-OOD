package ood.design_patterns.behavioral.strategy.duck.context_duck;

import ood.design_patterns.behavioral.strategy.duck.strategy_fly.impl.FlyNoWay;
import ood.design_patterns.behavioral.strategy.duck.strategy_quack.impl.Squeak;

public class RubberDuck extends _Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
