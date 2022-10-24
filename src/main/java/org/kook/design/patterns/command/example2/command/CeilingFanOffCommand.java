package org.kook.design.patterns.command.example2.command;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.CeilingFan;

@RequiredArgsConstructor
public class CeilingFanOffCommand implements Command {

    private final CeilingFan ceilingFan;
    private CeilingFan.SpeedMode previousSpeedMode;

    @Override
    public void execute() {
        previousSpeedMode = ceilingFan.getSpeedMode();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (previousSpeedMode != null) {
            ceilingFan.on(previousSpeedMode);
        }
    }

}
