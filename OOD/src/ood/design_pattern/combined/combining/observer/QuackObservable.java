package ood.design_pattern.combined.combining.observer;

public interface QuackObservable {
    public void registerObserver(IObserver observer);

    public void notifyObservers();
}
