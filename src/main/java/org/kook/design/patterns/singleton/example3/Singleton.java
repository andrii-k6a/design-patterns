package org.kook.design.patterns.singleton.example3;

/**
 * Thread-safe singleton with lazy instantiation, but with performance issues
 */
public class Singleton {

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printHello() {
        System.out.println("Hello!");
    }

}
