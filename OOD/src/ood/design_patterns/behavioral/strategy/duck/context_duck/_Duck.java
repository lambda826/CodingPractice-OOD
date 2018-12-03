package ood.design_patterns.behavioral.strategy.duck.context_duck;

import ood.design_patterns.behavioral.strategy.duck.strategy_fly.IFlyBehavior;
import ood.design_patterns.behavioral.strategy.duck.strategy_quack.IQuackBehavior;

public abstract class _Duck {

    protected IFlyBehavior flyBehavior;
    protected IQuackBehavior quackBehavior;

    public _Duck() {
    }

    abstract void display();

    public void setFlyBehavior(IFlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
