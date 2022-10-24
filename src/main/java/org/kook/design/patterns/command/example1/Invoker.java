package org.kook.design.patterns.command.example1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Invoker {

    private final Command command;

    public void doStuff() {
        command.execute();
    }

    public void undoStuff() {
        command.undo();
    }

}
