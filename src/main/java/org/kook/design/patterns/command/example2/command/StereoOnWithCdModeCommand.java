package org.kook.design.patterns.command.example2.command;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.Stereo;

@RequiredArgsConstructor
public class StereoOnWithCdModeCommand implements Command {

    private final Stereo stereo;

    @Override
    public void execute() {
        stereo.setCd();
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }

}
