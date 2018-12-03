package ood.design_patterns.behavioral.strategy.duck.context_duck;

import ood.design_patterns.behavioral.strategy.duck.strategy_fly.impl.FlyNoWay;
import ood.design_patterns.behavioral.strategy.duck.strategy_quack.impl.MuteQuack;

public class DecoyDuck extends _Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
