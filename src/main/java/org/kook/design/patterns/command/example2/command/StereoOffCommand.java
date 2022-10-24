package org.kook.design.patterns.command.example2.command;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.Stereo;

@RequiredArgsConstructor
public class StereoOffCommand implements Command {

    private final Stereo stereo;

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }

}
