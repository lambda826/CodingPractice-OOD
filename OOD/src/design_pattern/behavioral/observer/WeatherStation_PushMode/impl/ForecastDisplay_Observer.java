package design_pattern.behavioral.observer.WeatherStation_PushMode.impl;

import design_pattern.behavioral.observer.WeatherStation_PushMode.IDisplayElement;
import design_pattern.behavioral.observer.WeatherStation_PushMode.IObserver;

public class ForecastDisplay_Observer implements IObserver, IDisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData_Subject weatherData;

    public ForecastDisplay_Observer(WeatherData_Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
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
