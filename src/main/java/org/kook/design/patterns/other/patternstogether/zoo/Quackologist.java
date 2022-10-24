package org.kook.design.patterns.other.patternstogether.zoo;

import org.kook.design.patterns.other.patternstogether.observer.Observer;

public class Quackologist implements Observer {

    @Override
    public void update(Quackable quackable) {
        System.out.println("Quack was detected by: " + quackable);
    }

}
