package org.kook.design.patterns.other.patternstogether.decorator;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.other.patternstogether.observer.Observer;
import org.kook.design.patterns.other.patternstogether.zoo.Quackable;

/**
 * It's a decorator that allows to count number of quacks
 */
@RequiredArgsConstructor
public class QuackCounter implements Quackable {

    // we want to count all quacks, so we should use static variable
    private static int totalNumberOfQuacks;

    private final Quackable quackable;

    @Override
    public void quack() {
        quackable.quack();
        totalNumberOfQuacks++;
    }

    public static int getTotalNumberOfQuacks() {
        return totalNumberOfQuacks;
    }

    @Override
    public void addObserver(Observer observer) {
        quackable.addObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }

}
