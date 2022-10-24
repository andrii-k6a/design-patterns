package org.kook.design.patterns.bridge.example1;

public class DefaultAbstraction extends Abstraction {

    public DefaultAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void makeRequest() {
        implementor.request();
    }

}
