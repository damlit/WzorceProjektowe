import observer.boundary.CurrentWeatherConditions;
import observer.control.WeatherData;
import org.junit.Assert;
import org.junit.Test;

public class ObservableTest {

    @Test
    public void addObservableTest() {
        WeatherData weatherData = new WeatherData();
        CurrentWeatherConditions currentWeatherConditions = new CurrentWeatherConditions(weatherData);

        weatherData.setMeasurement(22.3f, 61, 1010.1f);

        Assert.assertEquals(22.3, currentWeatherConditions.getTemperature(), 0.01);
        Assert.assertEquals(61, currentWeatherConditions.getHumidity(), 0.01);
        Assert.assertEquals(1010.1f, currentWeatherConditions.getPressure(), 0.01);
    }

    @Test
    public void removeObservableTest() {
        WeatherData weatherData = new WeatherData();
        CurrentWeatherConditions currentWeatherConditions = new CurrentWeatherConditions(weatherData);

        weatherData.setMeasurement(22.3f, 61, 1010.1f);

        Assert.assertEquals(22.3, currentWeatherConditions.getTemperature(), 0.01);
        Assert.assertEquals(61, currentWeatherConditions.getHumidity(), 0.01);
        Assert.assertEquals(1010.1f, currentWeatherConditions.getPressure(), 0.01);

        weatherData.removeObserver(currentWeatherConditions);

        weatherData.setMeasurement(21.5f, 69, 1000.1f);

        Assert.assertNotEquals(21.5f, currentWeatherConditions.getTemperature(), 0.01);
        Assert.assertNotEquals(69, currentWeatherConditions.getHumidity(), 0.01);
        Assert.assertNotEquals(1000.1f, currentWeatherConditions.getPressure(), 0.01);
    }
}