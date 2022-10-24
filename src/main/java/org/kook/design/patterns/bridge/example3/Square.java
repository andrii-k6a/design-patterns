package org.kook.design.patterns.bridge.example3;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void print() {
        System.out.printf("%s square%n", color.name());
    }

}
