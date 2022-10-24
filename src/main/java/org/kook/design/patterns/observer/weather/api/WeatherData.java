package org.kook.design.patterns.observer.weather.api;

public interface WeatherData {

    Double getTemperature();

    Double getHumidity();

    Double getPressure();

    void measurementsChanged();

}
