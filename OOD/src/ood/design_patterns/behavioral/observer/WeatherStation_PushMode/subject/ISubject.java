package ood.design_patterns.behavioral.observer.WeatherStation_PushMode.subject;

import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.observer.IObserver;

public interface ISubject {

    public void registerObserver(IObserver o);

    public void removeObserver(IObserver o);

    public void notifyObservers();

}
