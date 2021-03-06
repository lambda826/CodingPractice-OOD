package ood.design_patterns.behavioral.observer.WeatherStation_PushMode;

import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.observer.impl.CurrentConditionsDisplay;
import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.observer.impl.ForecastDisplay;
import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.observer.impl.StatisticsDisplay;
import ood.design_patterns.behavioral.observer.WeatherStation_PushMode.subject.impl.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // Notifications
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        currentDisplay.unSubscribe(weatherData);

    }
}
