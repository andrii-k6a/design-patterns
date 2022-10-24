package org.kook.design.patterns.abstarctfactory;

import org.kook.design.patterns.abstarctfactory.ingredient.factory.KyivPizzaIngredientFactory;
import org.kook.design.patterns.abstarctfactory.ingredient.factory.LvivPizzaIngredientFactory;

public class Main {
    public static void main(String[] args) {

        var kievPizzaIngredientFactory = new KyivPizzaIngredientFactory();
        var lvivPizzaIngredientFactory = new LvivPizzaIngredientFactory();
        var kievCheesePizza = new CheesePizza(kievPizzaIngredientFactory);
        var lvivCheesePizza = new CheesePizza(lvivPizzaIngredientFactory);
        var kievClamPizza = new ClamPizza(kievPizzaIngredientFactory);
        var lvivClamPizza = new ClamPizza(lvivPizzaIngredientFactory);

        kievCheesePizza.makePizza();
        lvivCheesePizza.makePizza();
        kievClamPizza.makePizza();
        lvivClamPizza.makePizza();

    }
}
