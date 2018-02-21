package design_pattern.behavioral.strategy.demo2.duck;

import design_pattern.behavioral.strategy.demo2.fly.FlyNoWay;
import design_pattern.behavioral.strategy.demo2.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
