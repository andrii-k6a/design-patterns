package org.kook.design.patterns.command.example1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PrintHelloCommand implements Command {

    private final Receiver receiver;

    @Override
    public void execute() {
        receiver.printHello();
    }

    @Override
    public void undo() {
        receiver.printGoodbye();
    }

}
