package org.kook.design.patterns.iterator.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        init();
    }

    private void init() {
        addMenuItem(
                MenuItem.builder()
                        .name("Blueberry Pancake")
                        .price(2.99)
                        .build()
        );
        addMenuItem(
                MenuItem.builder()
                        .name("Waffles")
                        .price(3.59)
                        .build()
        );
    }

    @Override
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createMenuItemsIterator() {
        return menuItems.iterator();
    }

}
