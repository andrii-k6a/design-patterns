package org.kook.design.patterns.command.example2.command;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.GarageDoor;

@RequiredArgsConstructor
public class GarageDoorCloseCommand implements Command {

    private final GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }

}
