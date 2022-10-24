package org.kook.design.patterns.command.example2;

import org.kook.design.patterns.command.example2.command.Command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class RemoteControl {

    private final List<Command> onCommands;
    private final List<Command> offCommands;
    private final int commandsNumber;
    private final Deque<Command> executedCommands;

    public RemoteControl(List<Command> onCommands, List<Command> offCommands) {
        if (onCommands.size() != offCommands.size()) {
            throw new IllegalArgumentException("Different number of ON and OFF commands");
        }
        this.commandsNumber = onCommands.size();
        this.onCommands = onCommands;
        this.offCommands = offCommands;
        this.executedCommands = new ArrayDeque<>();
    }

    public void clickButtonOn(int commandIndex) {
        Command command = onCommands.get(commandIndex);
        command.execute();
        executedCommands.push(command);
    }

    public void clickButtonOff(int commandIndex) {
        Command command = offCommands.get(commandIndex);
        command.execute();
        executedCommands.push(command);
    }

    public void clickButtonUndo() {
        Command command = executedCommands.pop();
        command.undo();
    }

    public int getCommandsNumber() {
        return commandsNumber;
    }

}
