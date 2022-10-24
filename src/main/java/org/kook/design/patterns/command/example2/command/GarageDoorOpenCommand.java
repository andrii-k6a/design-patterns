package org.kook.design.patterns.command.example2.command;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.GarageDoor;

@RequiredArgsConstructor
public class GarageDoorOpenCommand implements Command {

    private final GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }

}
