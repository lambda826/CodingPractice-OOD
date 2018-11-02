package design_pattern.behavioral.strategy.duck.context_duck;

import design_pattern.behavioral.strategy.duck.strategy_fly.impl.FlyWithWings;
import design_pattern.behavioral.strategy.duck.strategy_quack.impl.Quack;

public class MallardDuck extends _Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
