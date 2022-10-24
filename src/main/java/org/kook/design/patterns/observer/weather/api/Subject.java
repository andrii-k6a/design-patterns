package org.kook.design.patterns.observer.weather.api;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
