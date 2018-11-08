package ood.design_pattern.behavioral.strategy.duck.context_duck;

import ood.design_pattern.behavioral.strategy.duck.strategy_fly.impl.FlyWithWings;
import ood.design_pattern.behavioral.strategy.duck.strategy_quack.impl.Quack;

public class RedHeadDuck extends _Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
