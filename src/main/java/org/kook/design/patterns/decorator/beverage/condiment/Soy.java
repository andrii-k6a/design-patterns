package org.kook.design.patterns.decorator.beverage.condiment;

import org.kook.design.patterns.decorator.beverage.Beverage;
import org.kook.design.patterns.decorator.beverage.Size;

import java.util.Map;

public class Soy extends CondimentDecorator {

    private final Beverage beverage;
    private final Map<Size, Double> prices = Map.of(
            Size.TALL, 0.3,
            Size.GRANDE, 0.5,
            Size.VENTI, 0.7
    );

    public Soy(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return prices.get(getSize()) + beverage.cost();
    }

}
