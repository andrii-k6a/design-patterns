package org.kook.design.patterns.other.patternstogether.factory;

import org.kook.design.patterns.other.patternstogether.zoo.Quackable;

public interface DuckFactory {

    Quackable createMallardDuck();

    Quackable createRedheadDuck();

    Quackable createDuckCall();

    Quackable createRubberDuck();

}
