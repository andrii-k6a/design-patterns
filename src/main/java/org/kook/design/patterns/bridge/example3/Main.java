package org.kook.design.patterns.bridge.example3;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Square(new Green());
        Shape s2 = new Square(new Red());
        Shape s3 = new Square(new Blue());

        Shape s4 = new Triangle(new Green());
        Shape s5 = new Triangle(new Red());
        Shape s6 = new Triangle(new Blue());

        Shape s7 = new Circle(new Green());
        Shape s8 = new Circle(new Red());
        Shape s9 = new Circle(new Blue());

        s1.print();
        s2.print();
        s3.print();
        s4.print();
        s5.print();
        s6.print();
        s7.print();
        s8.print();
        s9.print();

    }
}
