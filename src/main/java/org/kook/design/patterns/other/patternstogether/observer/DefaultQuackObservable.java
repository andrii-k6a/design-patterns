package org.kook.design.patterns.other.patternstogether.observer;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.other.patternstogether.zoo.Quackable;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class DefaultQuackObservable implements QuackObservable {

    private final List<Observer> observers = new ArrayList<>();
    private final Quackable quackable;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(quackable));
    }

}
