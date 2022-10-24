package org.kook.design.patterns.decorator.beverage.condiment;

import org.kook.design.patterns.decorator.beverage.Beverage;
import org.kook.design.patterns.decorator.beverage.Size;

import java.util.Map;

public class Mocha extends CondimentDecorator {

    private final Beverage beverage;
    private final Map<Size, Double> prices = Map.of(
            Size.TALL, 0.4,
            Size.GRANDE, 0.6,
            Size.VENTI, 0.8
    );

    public Mocha(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return prices.get(getSize()) + beverage.cost();
    }

}
