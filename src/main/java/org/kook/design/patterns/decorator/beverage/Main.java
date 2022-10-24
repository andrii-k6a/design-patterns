package org.kook.design.patterns.decorator.beverage;

import org.kook.design.patterns.decorator.beverage.condiment.Milk;
import org.kook.design.patterns.decorator.beverage.condiment.Mocha;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Mocha(new Milk(new HouseBlend("House blend", Size.GRANDE)));
        System.out.println(beverage.getDescription() + " : " + beverage.cost());

    }
}
