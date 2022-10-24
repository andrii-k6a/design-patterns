package org.kook.design.patterns.command.example2.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Doing nothing...");
    }

    @Override
    public void undo() {
        System.out.println("Undoing nothing...");
    }

}
