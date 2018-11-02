package design_pattern.behavioral.strategy.duck;

import design_pattern.behavioral.strategy.duck.context_duck.DecoyDuck;
import design_pattern.behavioral.strategy.duck.context_duck.MallardDuck;
import design_pattern.behavioral.strategy.duck.context_duck.ModelDuck;
import design_pattern.behavioral.strategy.duck.context_duck.RubberDuck;
import design_pattern.behavioral.strategy.duck.context_duck._Duck;
import design_pattern.behavioral.strategy.duck.strategy_fly.impl.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        _Duck mallard = new MallardDuck();
        _Duck rubberDuckie = new RubberDuck();
        _Duck decoy = new DecoyDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        _Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
