package design_pattern.behavioral.observer.WeatherStation_PushMode.impl;

import design_pattern.behavioral.observer.WeatherStation_PushMode.IDisplayElement;
import design_pattern.behavioral.observer.WeatherStation_PushMode.IObserver;
import design_pattern.behavioral.observer.WeatherStation_PushMode.ISubject;

public class CurrentConditionsDisplay_Observer implements IObserver, IDisplayElement {

    private float temperature;
    private float humidity;
    // Subject的引用，可以实现pull mode, 也可以随时注销对于subject的订阅
    private ISubject weatherData;

    public CurrentConditionsDisplay_Observer(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
