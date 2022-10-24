package org.kook.design.patterns.abstarctfactory;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.abstarctfactory.ingredient.*;

import java.util.List;

@RequiredArgsConstructor
public abstract class Pizza {

    private final String name;

    protected Dough dough;
    protected Sauce sauce;
    protected List<Veggie> veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void makePizza();

    public String getName() {
        return name;
    }

}
