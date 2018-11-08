package ood.design_pattern.structural.adapter.ducks;

public class _04_WildTurkey implements _03_ITurkey {

    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }

}
