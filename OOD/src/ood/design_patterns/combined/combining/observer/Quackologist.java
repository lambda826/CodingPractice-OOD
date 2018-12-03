package ood.design_patterns.combined.combining.observer;

public class Quackologist implements IObserver {

    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }

    public String toString() {
        return "Quackologist";
    }
}
