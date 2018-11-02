package design_pattern.behavioral.strategy.duck.strategy_fly.impl;

import design_pattern.behavioral.strategy.duck.strategy_fly.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket");
    }

}