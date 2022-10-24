package org.kook.design.patterns.abstarctfactory.ingredient.factory;

import org.kook.design.patterns.abstarctfactory.ingredient.*;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.FreshClams;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.Garlic;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.MarinaraSauce;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.Mushroom;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.Onion;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.RedPepper;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.ReggianoCheese;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.SlicedPepperoni;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.ThinCrustDough;

import java.util.List;

public class KyivPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggie> createVeggies() {
        return List.of(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

}
