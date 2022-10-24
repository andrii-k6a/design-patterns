package org.kook.design.patterns.other.patternstogether.observer;

public interface QuackObservable {

    void addObserver(Observer observer);

    void notifyObservers();

}
