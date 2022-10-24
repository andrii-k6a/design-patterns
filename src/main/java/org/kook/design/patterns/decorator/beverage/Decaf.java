package org.kook.design.patterns.decorator.beverage;

import java.util.Map;

public class Decaf extends Beverage {

    private final Map<Size, Double> prices = Map.of(
            Size.TALL, 1.1,
            Size.GRANDE, 1.3,
            Size.VENTI, 1.5
    );

    public Decaf(String description, Size size) {
        super(description, size);
    }

    @Override
    public double cost() {
        return prices.get(getSize());
    }

}
