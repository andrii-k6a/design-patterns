package org.kook.design.patterns.decorator.beverage;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Beverage {

    private final String description;
    private final Size size;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();

}
