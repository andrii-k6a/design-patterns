package org.kook.design.patterns.strategy.behavior.quack;

public class DefaultQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
