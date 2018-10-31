package design_pattern.behavioral.observer.WeatherStation_PushMode;

import design_pattern.behavioral.observer.WeatherStation_PushMode.impl.CurrentConditionsDisplay_Observer;
import design_pattern.behavioral.observer.WeatherStation_PushMode.impl.ForecastDisplay_Observer;
import design_pattern.behavioral.observer.WeatherStation_PushMode.impl.StatisticsDisplay_Observer;
import design_pattern.behavioral.observer.WeatherStation_PushMode.impl.WeatherData_Subject;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData_Subject weatherData = new WeatherData_Subject();

        CurrentConditionsDisplay_Observer currentDisplay = new CurrentConditionsDisplay_Observer(weatherData);
        StatisticsDisplay_Observer statisticsDisplay = new StatisticsDisplay_Observer(weatherData);
        ForecastDisplay_Observer forecastDisplay = new ForecastDisplay_Observer(weatherData);

        // Notifications
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        currentDisplay.unSubscribe(weatherData);

    }
}
