package org.kook.design.patterns.other.patternstogether.zoo;

import org.kook.design.patterns.other.patternstogether.observer.DefaultQuackObservable;
import org.kook.design.patterns.other.patternstogether.observer.Observer;
import org.kook.design.patterns.other.patternstogether.observer.QuackObservable;

public class DuckCall implements Quackable {

    private final QuackObservable observable;

    public DuckCall() {
        this.observable = new DefaultQuackObservable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observable.addObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

}
