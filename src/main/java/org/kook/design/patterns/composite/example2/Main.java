package org.kook.design.patterns.composite.example2;

public class Main {

    public static void main(String[] args) {

        MenuComponent allMenus = createAllMenus();
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }

    private static MenuComponent createAllMenus() {
        Menu pancakeHouseMenu = new Menu("Pancake house menu", "It's a main menu of the Pancake house");
        pancakeHouseMenu.add(MenuItem.builder()
                .name("Blueberry Pancake")
                .description("Yummy")
                .price(2.99)
                .vegetarian(true)
                .build()
        );

        Menu dinnerDessertMenu = new Menu("Dinner dessert menu", "It's a dessert menu of the Dinner cafe");
        dinnerDessertMenu.add(
                MenuItem.builder()
                        .name("Waffles")
                        .description("The best dessert")
                        .price(3.00)
                        .vegetarian(true)
                        .build()
        );

        Menu dinnerMenu = new Menu("Dinner menu", "It's a main menu of the Dinner cafe");
        dinnerMenu.add(dinnerDessertMenu);
        dinnerMenu.add(
                MenuItem.builder()
                        .name("Vegetarian BLT")
                        .description("Tasty")
                        .price(1.00)
                        .vegetarian(true)
                        .build()
        );

        Menu allMenus = new Menu("All menus", "All available menus");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        return allMenus;
    }

}
