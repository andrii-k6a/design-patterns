package org.kook.design.patterns.command.example2.thirdparty.impl;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.CeilingFan;

@RequiredArgsConstructor
public class SimpleCeilingFan implements CeilingFan {

    private final String location;
    private SpeedMode currentSpeedMode = SpeedMode.OFF;

    @Override
    public void high() {
        currentSpeedMode = SpeedMode.HIGH;
        System.out.println("Ceiling fan mode is High. Location: " + location);
    }

    @Override
    public void medium() {
        currentSpeedMode = SpeedMode.MEDIUM;
        System.out.println("Ceiling fan mode is Medium. Location: " + location);
    }

    @Override
    public void low() {
        currentSpeedMode = SpeedMode.LOW;
        System.out.println("Ceiling fan mode is Low. Location: " + location);
    }

    @Override
    public void off() {
        currentSpeedMode = SpeedMode.OFF;
        System.out.println("Ceiling fan is Off. Location: " + location);
    }

    @Override
    public void on(SpeedMode speedMode) {
        switch (speedMode) {
            case OFF:
                off();
                break;
            case LOW:
                low();
                break;
            case MEDIUM:
                medium();
                break;
            case HIGH:
                high();
                break;
            default:
                throw new IllegalArgumentException("Unexpected speed mode");
        }
    }

    @Override
    public SpeedMode getSpeedMode() {
        return currentSpeedMode;
    }

}
