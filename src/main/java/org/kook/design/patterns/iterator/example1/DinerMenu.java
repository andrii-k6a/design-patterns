package org.kook.design.patterns.iterator.example1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;

    private final MenuItem[] menuItems;
    private int numberOfItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        init();
    }

    private void init() {
        addMenuItem(
                MenuItem.builder()
                        .name("Vegetarian BLT")
                        .price(1.00)
                        .build()
        );
        addMenuItem(
                MenuItem.builder()
                        .name("Soup of the day")
                        .price(3.29)
                        .build()
        );
    }

    @Override
    public void addMenuItem(MenuItem menuItem) {
        if (numberOfItems >= MAX_ITEMS) {
            throw new IllegalStateException("The menu is full");
        }
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }

    @Override
    public Iterator<MenuItem> createMenuItemsIterator() {
        return new DinnerMenuIterator();
    }

    private class DinnerMenuIterator implements Iterator<MenuItem> {

        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < menuItems.length && menuItems[cursor] != null;
        }

        @Override
        public MenuItem next() {
            if (hasNext()) {
                MenuItem menuItem = menuItems[cursor];
                cursor++;
                return menuItem;
            }
            throw new NoSuchElementException();
        }

    }

}
