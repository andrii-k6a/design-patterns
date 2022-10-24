package org.kook.design.patterns.composite.example2;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

/*
 * The leaf
 * */
@RequiredArgsConstructor
@Builder
public class MenuItem implements MenuComponent {

    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final Double price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("************ MENU ITEM ************");
        System.out.print(getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("Description: " + getDescription());
    }

}
