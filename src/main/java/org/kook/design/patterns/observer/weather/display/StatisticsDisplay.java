package org.kook.design.patterns.observer.weather.display;

import org.kook.design.patterns.observer.weather.api.Subject;
import org.kook.design.patterns.observer.weather.api.dto.WeatherUpdateNotification;
import org.kook.design.patterns.observer.weather.api.Observer;

public class StatisticsDisplay implements Display, Observer {

    private String statistics;

    public StatisticsDisplay(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(statistics);
        System.out.println("**************************************************");
    }

    @Override
    public void update(WeatherUpdateNotification notification) {
        if (statistics == null) {
            statistics = String.format("STATISTICS UPDATE! Temperature: %s. Humidity: %s. Pressure: %s.",
                    notification.getTemperature(),
                    notification.getHumidity(),
                    notification.getPressure());
        } else {
            statistics += String.format("%nSTATISTICS UPDATE! Temperature: %s. Humidity: %s. Pressure: %s.",
                    notification.getTemperature(),
                    notification.getHumidity(),
                    notification.getPressure());
        }
        display();
    }

}
