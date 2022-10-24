package org.kook.design.patterns.observer.weather.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class WeatherUpdateNotification {

    private final Double temperature;
    private final Double humidity;
    private final Double pressure;

}
