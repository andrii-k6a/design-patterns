package org.kook.design.patterns.decorator.beverage;

import java.util.Map;

public class DarkRoast extends Beverage {

    private final Map<Size, Double> prices = Map.of(
            Size.TALL, 4.4,
            Size.GRANDE, 4.6,
            Size.VENTI, 4.8
    );

    public DarkRoast(String description, Size size) {
        super(description, size);
    }

    @Override
    public double cost() {
        return prices.get(getSize());
    }

}
