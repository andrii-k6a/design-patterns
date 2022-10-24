package org.kook.design.patterns.strategy;

import org.kook.design.patterns.strategy.behavior.fly.DefaultFlyBehavior;
import org.kook.design.patterns.strategy.behavior.fly.NoFlyBehavior;
import org.kook.design.patterns.strategy.behavior.quack.DefaultQuackBehavior;
import org.kook.design.patterns.strategy.behavior.quack.TripleQuackBehavior;

public class Main {
    public static void main(String[] args) {
        DefaultDuck defaultDuck = new DefaultDuck(new DefaultFlyBehavior(), new DefaultQuackBehavior());
        defaultDuck.performFly();
        defaultDuck.performQuack();

        System.out.println("*********************************");

        CustomDuck customDuck = new CustomDuck(new NoFlyBehavior(), new TripleQuackBehavior());
        customDuck.performFly();
        customDuck.performQuack();

    }
}
