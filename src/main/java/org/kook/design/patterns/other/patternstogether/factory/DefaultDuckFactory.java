package org.kook.design.patterns.other.patternstogether.factory;

import org.kook.design.patterns.other.patternstogether.zoo.DuckCall;
import org.kook.design.patterns.other.patternstogether.zoo.MallardDuck;
import org.kook.design.patterns.other.patternstogether.zoo.Quackable;
import org.kook.design.patterns.other.patternstogether.zoo.RedheadDuck;
import org.kook.design.patterns.other.patternstogether.zoo.RubberDuck;

public class DefaultDuckFactory implements DuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

}
