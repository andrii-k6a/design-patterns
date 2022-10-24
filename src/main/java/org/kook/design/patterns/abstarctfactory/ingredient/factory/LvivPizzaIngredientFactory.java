package org.kook.design.patterns.abstarctfactory.ingredient.factory;

import org.kook.design.patterns.abstarctfactory.ingredient.*;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.BlackOlives;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.EggPlant;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.FrozenClams;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.MozzarellaCheese;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.PlumTomatoSauce;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.SlicedPepperoni;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.Spinach;
import org.kook.design.patterns.abstarctfactory.ingredient.impl.ThickCrustDough;

import java.util.List;

public class LvivPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public List<Veggie> createVeggies() {
        return List.of(new BlackOlives(), new Spinach(), new EggPlant());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

}
