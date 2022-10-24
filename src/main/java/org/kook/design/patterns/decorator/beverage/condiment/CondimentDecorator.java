package org.kook.design.patterns.decorator.beverage.condiment;

import org.kook.design.patterns.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public CondimentDecorator(Beverage beverage) {
        super(beverage.getDescription(), beverage.getSize());
    }

    @Override
    public abstract String getDescription();

}
