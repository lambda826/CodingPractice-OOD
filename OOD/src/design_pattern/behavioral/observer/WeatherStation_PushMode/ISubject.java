package design_pattern.behavioral.observer.WeatherStation_PushMode;

public interface ISubject {

    public void registerObserver(IObserver o);

    public void removeObserver(IObserver o);

    public void notifyObservers();

}
