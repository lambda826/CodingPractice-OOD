package headfirst.strategy;

public class FlyRocketPowered implements IFlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
