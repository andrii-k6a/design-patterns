package org.kook.design.patterns.command.example1;

public class Main {
    public static void main(String[] args) {

        Invoker invoker = new Invoker(new PrintHelloCommand(new Receiver()));
        invoker.doStuff();
        invoker.undoStuff();

    }
}
