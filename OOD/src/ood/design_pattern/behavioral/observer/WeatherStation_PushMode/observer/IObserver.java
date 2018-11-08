package ood.design_pattern.behavioral.observer.WeatherStation_PushMode.observer;

import ood.design_pattern.behavioral.observer.WeatherStation_PushMode.subject.ISubject;

public interface IObserver {

    public void update(double temp, double humidity, double pressure);

    public default void unSubscribe(ISubject subject) {
        System.out.println(this);
        subject.removeObserver(this);
    }
}
