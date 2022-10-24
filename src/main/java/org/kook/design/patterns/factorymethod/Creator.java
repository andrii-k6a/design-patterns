package org.kook.design.patterns.factorymethod;

public abstract class Creator {

    private final Product product;

    public Creator() {
        this.product = createProduct();
    }

    public void printProductName() {
        System.out.println(product.getName());
    }

    public abstract Product createProduct();

}
