package org.kook.design.patterns.composite.example2;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/*
 * The composite
 * */
@RequiredArgsConstructor
public class Menu implements MenuComponent {

    private final List<MenuComponent> menuComponents = new ArrayList<>();
    private final String name;
    private final String description;

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        menuComponents.forEach(MenuComponent::print);
    }

}
