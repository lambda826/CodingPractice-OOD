package ood.design_pattern.combined.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            IObserver observer = (IObserver) iterator.next();
            observer.update(duck);
        }
    }

    public Iterator getObservers() {
        return observers.iterator();
    }
}
