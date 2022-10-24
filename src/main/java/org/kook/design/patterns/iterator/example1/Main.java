package org.kook.design.patterns.iterator.example1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        printSeparator();

        Menu dinerMenu = new DinerMenu();
        printEach(dinerMenu.createMenuItemsIterator());
        printSeparator();

        Menu pancakeHouseMenu = new PancakeHouseMenu();
        printEach(pancakeHouseMenu.createMenuItemsIterator());
        printSeparator();

    }

    private static void printEach(Iterator<?> iterator) {
        iterator.forEachRemaining(System.out::println);
    }

    private static void printSeparator() {
        System.out.println("*************************************************");
    }

}
