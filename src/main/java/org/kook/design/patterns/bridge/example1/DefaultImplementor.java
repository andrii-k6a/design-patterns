package org.kook.design.patterns.bridge.example1;

public class DefaultImplementor implements Implementor {

    @Override
    public void request() {
        System.out.println("Making a default request...");
    }

}
