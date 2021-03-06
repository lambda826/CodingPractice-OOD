package ood.design_patterns.behavioral.observer.WeatherStation_PushMode.observer.impl;

import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.IDisplayElement;
import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.observer.IObserver;
import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.subject.ISubject;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private double temperature;
    private double humidity;
    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
