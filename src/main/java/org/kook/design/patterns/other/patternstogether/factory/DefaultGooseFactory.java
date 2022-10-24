package org.kook.design.patterns.other.patternstogether.factory;

import org.kook.design.patterns.other.patternstogether.adapter.GooseAdapter;
import org.kook.design.patterns.other.patternstogether.zoo.Goose;
import org.kook.design.patterns.other.patternstogether.zoo.Quackable;

public class DefaultGooseFactory implements GooseFactory {

    @Override
    public Goose createGoose() {
        return new Goose();
    }

    @Override
    public Quackable createQuackableGoose() {
        return new GooseAdapter(createGoose());
    }

}
