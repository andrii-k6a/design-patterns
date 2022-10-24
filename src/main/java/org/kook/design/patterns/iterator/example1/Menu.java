package org.kook.design.patterns.iterator.example1;

import java.util.Iterator;

/*
* Instead of Iterable
* */
public interface Menu {

    void addMenuItem(MenuItem menuItem);

    Iterator<MenuItem> createMenuItemsIterator();

}
