package org.kook.design.patterns.bridge.example3;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void print() {
        System.out.printf("%s triangle%n", color.name());
    }

}
