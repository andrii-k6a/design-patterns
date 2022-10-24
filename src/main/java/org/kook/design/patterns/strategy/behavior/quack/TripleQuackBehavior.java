package org.kook.design.patterns.strategy.behavior.quack;

public class TripleQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! Quack! Quack!");
    }
}
