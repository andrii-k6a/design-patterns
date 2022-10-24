package org.kook.design.patterns.observer.weather.display;

import org.kook.design.patterns.observer.weather.api.Subject;
import org.kook.design.patterns.observer.weather.api.dto.WeatherUpdateNotification;
import org.kook.design.patterns.observer.weather.api.Observer;

public class CurrentConditionsDisplay implements Display, Observer {

    private String currentConditions;

    public CurrentConditionsDisplay(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(currentConditions);
        System.out.println("**************************************************");
    }

    @Override
    public void update(WeatherUpdateNotification notification) {
        currentConditions = String.format("Temperature: %s. Humidity: %s. Pressure: %s.",
                notification.getTemperature(),
                notification.getHumidity(),
                notification.getPressure());
        display();
    }

}
