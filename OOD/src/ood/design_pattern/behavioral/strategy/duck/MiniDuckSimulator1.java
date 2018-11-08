package ood.design_pattern.behavioral.strategy.duck;

import ood.design_pattern.behavioral.strategy.duck.context_duck.MallardDuck;
import ood.design_pattern.behavioral.strategy.duck.context_duck.ModelDuck;
import ood.design_pattern.behavioral.strategy.duck.context_duck._Duck;
import ood.design_pattern.behavioral.strategy.duck.strategy_fly.impl.FlyRocketPowered;

public class MiniDuckSimulator1 {

    public static void main(String[] args) {

        _Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        _Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
