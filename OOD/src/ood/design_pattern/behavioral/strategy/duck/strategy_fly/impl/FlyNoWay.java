package ood.design_pattern.behavioral.strategy.duck.strategy_fly.impl;

import ood.design_pattern.behavioral.strategy.duck.strategy_fly.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

    public void fly() {
        System.out.println("I can't fly");
    }

}
