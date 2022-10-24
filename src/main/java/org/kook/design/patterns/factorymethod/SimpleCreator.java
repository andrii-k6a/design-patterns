package org.kook.design.patterns.factorymethod;

public class SimpleCreator extends Creator {

    @Override
    public Product createProduct() {
        return new SimpleProduct();
    }

}
