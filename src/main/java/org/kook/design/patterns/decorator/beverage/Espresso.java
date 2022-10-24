package org.kook.design.patterns.decorator.beverage;

import java.util.Map;

public class Espresso extends Beverage {

    private final Map<Size, Double> prices = Map.of(
            Size.TALL, 2.2,
            Size.GRANDE, 2.4,
            Size.VENTI, 2.6
    );

    public Espresso(String description, Size size) {
        super(description, size);
    }

    @Override
    public double cost() {
        return prices.get(getSize());
    }

}
