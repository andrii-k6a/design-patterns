package org.kook.design.patterns.observer.composition.api;

import java.util.ArrayList;
import java.util.List;

public class SimpleObserversContainer<T> implements ObserversContainer<T> {

    private final List<Observer<T>> observers = new ArrayList<>();

    @Override
    public void add(Observer<T> observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer<T> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(T notification) {
        observers.forEach(o -> o.update(notification));
    }

}
