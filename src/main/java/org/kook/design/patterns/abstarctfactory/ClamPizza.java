package org.kook.design.patterns.abstarctfactory;

import org.kook.design.patterns.abstarctfactory.ingredient.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super("Clam pizza");
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.cheese = pizzaIngredientFactory.createCheese();
        this.clams = pizzaIngredientFactory.createClams();
    }

    @Override
    public void makePizza() {
        System.out.printf("Making pizza: %s%n", getName());

        System.out.println("Dough: " + dough.getName());
        System.out.println("Sauce: " + sauce.getName());
        System.out.println("Cheese: " + cheese.getName());
        System.out.println("Clams: " + clams.getName());

        System.out.println("Done!");
    }

}
