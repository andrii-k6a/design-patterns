package org.kook.design.patterns.bridge.example1;

import java.util.concurrent.ThreadLocalRandom;

public class RandomAbstraction extends Abstraction {

    public RandomAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void makeRequest() {
        int randomInteger = ThreadLocalRandom.current().nextInt() % 10;
        int numberOfRequests = randomInteger < 0 ? -randomInteger : randomInteger;
        for (int i = 0; i < numberOfRequests; i++) {
            implementor.request();
        }
    }

}
