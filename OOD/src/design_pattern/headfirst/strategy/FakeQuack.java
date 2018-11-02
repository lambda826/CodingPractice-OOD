package headfirst.strategy;

public class FakeQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("Qwak");
    }
}
