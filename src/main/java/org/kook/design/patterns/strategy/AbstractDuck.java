package org.kook.design.patterns.strategy;

import lombok.AllArgsConstructor;
import org.kook.design.patterns.strategy.behavior.fly.FlyBehavior;
import org.kook.design.patterns.strategy.behavior.quack.QuackBehavior;

@AllArgsConstructor
public abstract class AbstractDuck {

    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    abstract String display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
