package design_pattern.behavioral.observer.WeatherStation_PushMode.observer.impl;

import design_pattern.behavioral.observer.WeatherStation_PushMode.IDisplayElement;
import design_pattern.behavioral.observer.WeatherStation_PushMode.observer.IObserver;
import design_pattern.behavioral.observer.WeatherStation_PushMode.subject.impl.WeatherData;

public class StatisticsDisplay implements IObserver, IDisplayElement {

    private double maxTemp = 0.0;
    private double minTemp = 200;
    private double tempSum = 0.0;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temp, double humidity, double pressure) {
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
