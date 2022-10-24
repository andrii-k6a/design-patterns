package org.kook.design.patterns.abstarctfactory.ingredient.factory;

import org.kook.design.patterns.abstarctfactory.ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    List<Veggie> createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();

}
