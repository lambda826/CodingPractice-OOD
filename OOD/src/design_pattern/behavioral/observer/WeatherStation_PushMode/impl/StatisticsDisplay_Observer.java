package design_pattern.behavioral.observer.WeatherStation_PushMode.impl;

import design_pattern.behavioral.observer.WeatherStation_PushMode.IDisplayElement;
import design_pattern.behavioral.observer.WeatherStation_PushMode.IObserver;

public class StatisticsDisplay_Observer implements IObserver, IDisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData_Subject weatherData;

    public StatisticsDisplay_Observer(WeatherData_Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
