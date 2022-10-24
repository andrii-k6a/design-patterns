package org.kook.design.patterns.bridge.example3;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void print() {
        System.out.printf("%s circle%n", color.name());
    }

}
