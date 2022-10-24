package org.kook.design.patterns.composite.example1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final Component component;

    public void executeOperation() {
        component.operation();
    }

}
