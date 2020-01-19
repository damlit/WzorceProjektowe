package observer;

import observer.boundary.CurrentWeatherConditions;
import observer.control.WeatherData;

public class Main {

    public static void main() {
        System.out.println("====== OBSERVABLE ======");
        WeatherData weatherData = new WeatherData();
        CurrentWeatherConditions currentWeatherConditions = new CurrentWeatherConditions(weatherData);

        weatherData.setMeasurement(25.5f, 65, 1013.1f);
        weatherData.setMeasurement(22.3f, 61, 1010.1f);
        weatherData.setMeasurement(29.1f, 85, 999.9f);

        System.out.println();
    }
}
