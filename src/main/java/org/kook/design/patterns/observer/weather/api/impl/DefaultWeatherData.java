package org.kook.design.patterns.observer.weather.api.impl;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.observer.weather.api.Subject;
import org.kook.design.patterns.observer.weather.api.dto.WeatherUpdateNotification;
import org.kook.design.patterns.observer.weather.api.Observer;
import org.kook.design.patterns.observer.weather.api.WeatherData;
import org.kook.design.patterns.observer.weather.api.WeatherStation;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class DefaultWeatherData implements WeatherData, Subject {

    private final WeatherStation weatherStation;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public Double getTemperature() {
        return weatherStation.getCurrentTemperature();
    }

    @Override
    public Double getHumidity() {
        return weatherStation.getCurrentHumidity();
    }

    @Override
    public Double getPressure() {
        return weatherStation.getCurrentPressure();
    }

    @Override
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        WeatherUpdateNotification notification = WeatherUpdateNotification.builder()
                .temperature(getTemperature())
                .humidity(getHumidity())
                .pressure(getPressure())
                .build();
        observers.forEach(observer -> observer.update(notification));
    }

}
