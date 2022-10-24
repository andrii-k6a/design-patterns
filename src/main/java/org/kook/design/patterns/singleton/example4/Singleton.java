package org.kook.design.patterns.singleton.example4;

/**
 * Thread-safe singleton with lazy instantiation (double-checked locking)
 */
public class Singleton {

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printHello() {
        System.out.println("Hello!");
    }

}
