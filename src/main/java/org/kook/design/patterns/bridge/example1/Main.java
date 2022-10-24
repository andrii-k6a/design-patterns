package org.kook.design.patterns.bridge.example1;

public class Main {
    public static void main(String[] args) {

        System.out.println("********** default abstraction and default implementor **********");
        Abstraction a1 = new DefaultAbstraction(new DefaultImplementor());
        a1.makeRequest();

        System.out.println("********** default abstraction and specific implementor *********");
        Abstraction a2 = new DefaultAbstraction(new SpecificImplementor());
        a2.makeRequest();

        System.out.println("********** random abstraction and default implementor ***********");
        Abstraction a3 = new RandomAbstraction(new DefaultImplementor());
        a3.makeRequest();

        System.out.println("********** random abstraction and specific implementor **********");
        Abstraction a4 = new RandomAbstraction(new SpecificImplementor());
        a4.makeRequest();

    }
}
