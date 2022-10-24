package org.kook.design.patterns.command.example2.thirdparty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public interface CeilingFan {

    void high();

    void medium();

    void low();

    void on(SpeedMode speedMode);

    void off();

    SpeedMode getSpeedMode();

    @RequiredArgsConstructor
    @Getter
    enum SpeedMode {

        OFF(0), LOW(10), MEDIUM(50), HIGH(90);

        private final int speed;

    }

}
