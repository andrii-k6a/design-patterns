package org.kook.design.patterns.strategy;

import org.kook.design.patterns.strategy.behavior.fly.FlyBehavior;
import org.kook.design.patterns.strategy.behavior.quack.QuackBehavior;

public class CustomDuck extends AbstractDuck {

    public CustomDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    String display() {
        return "custom duck";
    }
}
