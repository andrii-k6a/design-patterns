package org.kook.design.patterns.command.example2.thirdparty.impl;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.GarageDoor;

@RequiredArgsConstructor
public class SimpleGarageDoor implements GarageDoor {

    private final String location;

    @Override
    public void up() {
        System.out.println("Garage door is open. Location: " + location);
    }

    @Override
    public void down() {
        System.out.println("Garage door is closed. Location: " + location);
    }

    @Override
    public void stop() {
        System.out.println("Garage door is stopped. Location: " + location);
    }

    @Override
    public void lightOn() {
        System.out.println("Garage door light is On. Location: " + location);
    }

    @Override
    public void lightOff() {
        System.out.println("Garage door light is Off. Location: " + location);
    }

}
