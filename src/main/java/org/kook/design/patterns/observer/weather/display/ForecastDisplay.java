package org.kook.design.patterns.observer.weather.display;

import org.kook.design.patterns.observer.weather.api.dto.WeatherUpdateNotification;
import org.kook.design.patterns.observer.weather.api.Observer;
import org.kook.design.patterns.observer.weather.api.Subject;

public class ForecastDisplay implements Display, Observer {

    private String forecast;

    public ForecastDisplay(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(forecast);
        System.out.println("**************************************************");
    }

    @Override
    public void update(WeatherUpdateNotification notification) {
        Double pressure = notification.getPressure();
        if (pressure > 5000) {
            forecast = "Stay home!";
        } else {
            forecast = "Let's have fun!";
        }
        display();
    }

}
