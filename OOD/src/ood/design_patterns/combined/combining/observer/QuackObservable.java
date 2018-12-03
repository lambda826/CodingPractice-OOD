package ood.design_patterns.combined.combining.observer;

public interface QuackObservable {
    public void registerObserver(IObserver observer);

    public void notifyObservers();
}
