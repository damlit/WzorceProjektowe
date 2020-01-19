package observer.control;

import observer.boundary.WeatherObserver;

public interface WeatherObservable {

    void addObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObservers();
}
