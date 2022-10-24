package org.kook.design.patterns.observer.weather.api;

import org.kook.design.patterns.observer.weather.api.dto.WeatherUpdateNotification;

public interface Observer {

    void update(WeatherUpdateNotification notification);

}
