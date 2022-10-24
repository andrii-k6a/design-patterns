package org.kook.design.patterns.observer.noargobserver.composition.api;

public interface ObserversContainer {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

}
