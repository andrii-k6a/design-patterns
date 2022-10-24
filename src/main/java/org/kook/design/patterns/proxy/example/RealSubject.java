package org.kook.design.patterns.proxy.example;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("Request processing...");
    }

}
