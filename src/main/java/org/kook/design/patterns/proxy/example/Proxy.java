package org.kook.design.patterns.proxy.example;

import lombok.RequiredArgsConstructor;

import java.util.concurrent.ThreadLocalRandom;

@RequiredArgsConstructor
public class Proxy implements Subject {

    private final Subject subject;

    @Override
    public void request() {
        if (ThreadLocalRandom.current().nextInt() % 2 == 0) {
            subject.request();
        } else {
            System.out.println("Access denied");
        }
    }

}
