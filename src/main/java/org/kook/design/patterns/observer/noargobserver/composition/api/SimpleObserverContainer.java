package org.kook.design.patterns.observer.noargobserver.composition.api;

import java.util.ArrayList;
import java.util.List;

public class SimpleObserverContainer implements ObserversContainer {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

}
