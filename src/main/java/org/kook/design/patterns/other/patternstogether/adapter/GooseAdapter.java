package org.kook.design.patterns.other.patternstogether.adapter;

import org.kook.design.patterns.other.patternstogether.observer.DefaultQuackObservable;
import org.kook.design.patterns.other.patternstogether.observer.QuackObservable;
import org.kook.design.patterns.other.patternstogether.observer.Observer;
import org.kook.design.patterns.other.patternstogether.zoo.Goose;
import org.kook.design.patterns.other.patternstogether.zoo.Quackable;

public class GooseAdapter implements Quackable {

    private final Goose goose;
    private final QuackObservable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new DefaultQuackObservable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
