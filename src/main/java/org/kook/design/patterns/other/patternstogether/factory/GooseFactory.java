package org.kook.design.patterns.other.patternstogether.factory;

import org.kook.design.patterns.other.patternstogether.zoo.Goose;
import org.kook.design.patterns.other.patternstogether.zoo.Quackable;

public interface GooseFactory {

    Goose createGoose();

    Quackable createQuackableGoose();

}
