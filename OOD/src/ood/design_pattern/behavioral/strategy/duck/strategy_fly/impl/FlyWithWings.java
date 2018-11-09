package ood.design_pattern.behavioral.strategy.duck.strategy_fly.impl;

import ood.design_pattern.behavioral.strategy.duck.strategy_fly.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

    public void fly() {
        System.out.println("I'm flying!!");
    }

}