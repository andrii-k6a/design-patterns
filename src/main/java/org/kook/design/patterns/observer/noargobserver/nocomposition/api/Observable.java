package org.kook.design.patterns.observer.noargobserver.nocomposition.api;

public interface Observable {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

}
