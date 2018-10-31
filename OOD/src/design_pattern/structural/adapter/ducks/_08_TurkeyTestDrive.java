package design_pattern.structural.adapter.ducks;

public class _08_TurkeyTestDrive {
    public static void main(String[] args) {

        _02_MallardDuck duck = new _02_MallardDuck();
        _03_Turkey duckAdapter = new _07_DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
