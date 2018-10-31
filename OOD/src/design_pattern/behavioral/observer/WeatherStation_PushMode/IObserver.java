package design_pattern.behavioral.observer.WeatherStation_PushMode;

public interface IObserver {

    public void update(float temp, float humidity, float pressure);

    public default void unSubscribe(ISubject subject) {
        System.out.println(this);
        subject.registerObserver(this);
    }
}
