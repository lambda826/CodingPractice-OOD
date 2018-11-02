package design_pattern.behavioral.strategy.duck.context_duck;

import design_pattern.behavioral.strategy.duck.strategy_fly.impl.FlyNoWay;
import design_pattern.behavioral.strategy.duck.strategy_quack.impl.Quack;

public class ModelDuck extends _Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
