package org.kook.design.patterns.observer.weather;

import org.kook.design.patterns.observer.weather.api.Subject;
import org.kook.design.patterns.observer.weather.api.impl.DefaultWeatherData;
import org.kook.design.patterns.observer.weather.api.impl.RandomWeatherStation;
import org.kook.design.patterns.observer.weather.display.CurrentConditionsDisplay;
import org.kook.design.patterns.observer.weather.display.ForecastDisplay;
import org.kook.design.patterns.observer.weather.display.StatisticsDisplay;
import org.kook.design.patterns.observer.weather.api.WeatherData;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new DefaultWeatherData(new RandomWeatherStation());

        Subject subject = (Subject) weatherData;
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(subject);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(subject);
        ForecastDisplay forecastDisplay = new ForecastDisplay(subject);

        weatherData.measurementsChanged();
        weatherData.measurementsChanged();

    }
}
