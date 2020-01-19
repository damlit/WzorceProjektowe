package observer.control;

import observer.boundary.WeatherObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherData implements WeatherObservable {

    private List<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver weatherObserver) {
        observers = observers.stream()
                .filter(o -> !weatherObserver.equals(o))
                .collect(Collectors.toList());
    }

    public void notifyObservers() {
        observers.forEach(
                o -> o.update(temperature, humidity, pressure)
        );
    }

    public void getChanges() {
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        getChanges();
    }
}
