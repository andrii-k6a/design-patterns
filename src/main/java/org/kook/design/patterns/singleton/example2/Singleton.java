package org.kook.design.patterns.singleton.example2;

/**
 * Not thread-safe singleton with lazy instantiation
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printHello() {
        System.out.println("Hello!");
    }

}
