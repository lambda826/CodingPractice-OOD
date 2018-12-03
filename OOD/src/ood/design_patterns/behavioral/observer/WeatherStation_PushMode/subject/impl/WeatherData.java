package ood.design_patterns.behavioral.observer.WeatherStation_PushMode.subject.impl;

import java.util.ArrayList;

import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.observer.IObserver;
import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.subject.ISubject;

public class WeatherData implements ISubject {

    // One-to-many relation
    private ArrayList<IObserver> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // other WeatherData methods here

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
