package org.kook.design.patterns.other.fizzbuzz.printer;

public class ConsolePrinter implements Printer {

    @Override
    public void print(Object o) {
        System.out.println(o);
    }

}
