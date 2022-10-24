package org.kook.design.patterns.bridge.example1;

public class SpecificImplementor implements Implementor {

    @Override
    public void request() {
        System.out.println("Making a specific request...");
    }

}
