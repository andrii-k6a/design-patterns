package org.kook.design.patterns.decorator.beverage;

import java.util.Map;

public class HouseBlend extends Beverage {

    private final Map<Size, Double> prices = Map.of(
            Size.TALL, 3.3,
            Size.GRANDE, 3.5,
            Size.VENTI, 3.7
    );

    public HouseBlend(String description, Size size) {
        super(description, size);
    }

    @Override
    public double cost() {
        return prices.get(getSize());
    }

}
