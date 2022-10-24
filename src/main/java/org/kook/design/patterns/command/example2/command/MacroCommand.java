package org.kook.design.patterns.command.example2.command;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MacroCommand implements Command {

    private final List<Command> commands;

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        commands.forEach(Command::undo);
    }

}
