package design_pattern.behavioral.observer.WeatherStation_PushMode.impl;

import java.util.ArrayList;

import design_pattern.behavioral.observer.WeatherStation_PushMode.IObserver;
import design_pattern.behavioral.observer.WeatherStation_PushMode.ISubject;

public class WeatherData_Subject implements ISubject {

    // One-to-many relation
    private ArrayList<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData_Subject() {
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

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // other WeatherData methods here

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
