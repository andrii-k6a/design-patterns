package org.kook.design.patterns.strategy.behavior.fly;

public class DefaultFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
