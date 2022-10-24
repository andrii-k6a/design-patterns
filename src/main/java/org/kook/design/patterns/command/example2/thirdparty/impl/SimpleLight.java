package org.kook.design.patterns.command.example2.thirdparty.impl;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.Light;

@RequiredArgsConstructor
public class SimpleLight implements Light {

    private final String location;

    @Override
    public void on() {
        System.out.println("Light is On. Location: " + location);
    }

    @Override
    public void off() {
        System.out.println("Light is Off. Location: " + location);
    }

}
