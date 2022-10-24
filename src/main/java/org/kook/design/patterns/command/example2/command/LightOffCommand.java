package org.kook.design.patterns.command.example2.command;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.Light;

@RequiredArgsConstructor
public class LightOffCommand implements Command {

    private final Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
