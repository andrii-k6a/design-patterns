package org.kook.design.patterns.composite.example2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Waitress {

    private final MenuComponent allMenus;

    public void printMenu() {
        allMenus.print();
    }

}
