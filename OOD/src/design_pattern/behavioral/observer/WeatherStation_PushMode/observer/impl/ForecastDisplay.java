package design_pattern.behavioral.observer.WeatherStation_PushMode.observer.impl;

import design_pattern.behavioral.observer.WeatherStation_PushMode.IDisplayElement;
import design_pattern.behavioral.observer.WeatherStation_PushMode.observer.IObserver;
import design_pattern.behavioral.observer.WeatherStation_PushMode.subject.impl.WeatherData;

public class ForecastDisplay implements IObserver, IDisplayElement {

    private double currentPressure = 29.92;
    private double lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
