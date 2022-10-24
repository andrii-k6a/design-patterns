package org.kook.design.patterns.decorator.beverage.condiment;

import org.kook.design.patterns.decorator.beverage.Beverage;
import org.kook.design.patterns.decorator.beverage.Size;

import java.util.Map;

public class Milk extends CondimentDecorator {

    private final Beverage beverage;
    private final Map<Size, Double> prices = Map.of(
            Size.TALL, 0.5,
            Size.GRANDE, 0.7,
            Size.VENTI, 0.9
    );

    public Milk(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return prices.get(getSize()) + beverage.cost();
    }

}
