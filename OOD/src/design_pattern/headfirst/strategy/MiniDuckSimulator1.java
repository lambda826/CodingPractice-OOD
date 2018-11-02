package headfirst.strategy;

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
