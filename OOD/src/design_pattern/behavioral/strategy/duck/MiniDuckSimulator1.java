package design_pattern.behavioral.strategy.duck;

import design_pattern.behavioral.strategy.duck.context_duck.MallardDuck;
import design_pattern.behavioral.strategy.duck.context_duck.ModelDuck;
import design_pattern.behavioral.strategy.duck.context_duck._Duck;
import design_pattern.behavioral.strategy.duck.strategy_fly.impl.FlyRocketPowered;

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
