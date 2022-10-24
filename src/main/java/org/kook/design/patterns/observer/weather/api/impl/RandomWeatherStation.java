package org.kook.design.patterns.observer.weather.api.impl;

import org.kook.design.patterns.observer.weather.api.WeatherStation;

import java.util.concurrent.ThreadLocalRandom;

public class RandomWeatherStation implements WeatherStation {

    @Override
    public Double getCurrentTemperature() {
        return ThreadLocalRandom.current().nextDouble(-20, 20);
    }

    @Override
    public Double getCurrentHumidity() {
        return ThreadLocalRandom.current().nextDouble(0, 100);
    }

    @Override
    public Double getCurrentPressure() {
        return ThreadLocalRandom.current().nextDouble(1000, 10000);
    }

}
