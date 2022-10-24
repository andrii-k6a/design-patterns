package org.kook.design.patterns.observer.noargobserver.nocomposition;

import org.kook.design.patterns.observer.noargobserver.nocomposition.api.Observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleObservableStorage implements ObservableStorage {

    private final List<Observer> observers = new ArrayList<>();
    private String value;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
        notifyObservers();
    }

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
