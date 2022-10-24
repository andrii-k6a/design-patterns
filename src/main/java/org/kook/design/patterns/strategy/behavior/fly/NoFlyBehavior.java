package org.kook.design.patterns.strategy.behavior.fly;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cannot fly...");
    }
}
