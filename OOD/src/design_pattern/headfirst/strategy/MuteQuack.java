package headfirst.strategy;

public class MuteQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
