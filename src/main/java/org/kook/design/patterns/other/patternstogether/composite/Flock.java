package org.kook.design.patterns.other.patternstogether.composite;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.other.patternstogether.observer.Observer;
import org.kook.design.patterns.other.patternstogether.zoo.Quackable;

import java.util.List;

@RequiredArgsConstructor
public class Flock implements Quackable {

    private final List<Quackable> quackers;

    @Override
    public void quack() {
        quackers.forEach(Quackable::quack);
    }

    @Override
    public void addObserver(Observer observer) {
        quackers.forEach(quacker -> quacker.addObserver(observer));
    }

    @Override
    public void notifyObservers() {
        // do nothing
    }

}
