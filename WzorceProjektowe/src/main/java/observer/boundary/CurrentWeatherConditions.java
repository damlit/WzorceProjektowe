package observer.boundary;

import observer.control.WeatherObservable;

public class CurrentWeatherConditions implements DisplayWeatherConditions, WeatherObserver {

    private WeatherObservable weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentWeatherConditions(WeatherObservable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("--> temperature: " + temperature + " degrees C, " +
                            "humidity: " + humidity + "%, pressure: " + pressure + ".");
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
