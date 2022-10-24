package org.kook.design.patterns.facade.hometheater.impl;

import org.kook.design.patterns.facade.hometheater.TheaterLights;

public class DefaultTheaterLights implements TheaterLights {

    @Override
    public void on() {
        System.out.println("Lights is On");
    }

    @Override
    public void dim(int value) {
        System.out.printf("Lights dim: %d%n", value);
    }

}
