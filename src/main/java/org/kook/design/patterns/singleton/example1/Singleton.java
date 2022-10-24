package org.kook.design.patterns.singleton.example1;

/**
 * Thread-safe singleton with eager instantiation
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void printHello() {
        System.out.println("Hello!");
    }

}
