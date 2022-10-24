package org.kook.design.patterns.facade.hometheater.impl;

import org.kook.design.patterns.facade.hometheater.Amplifier;

public class DefaultAmplifier implements Amplifier {

    @Override
    public void on() {
        System.out.println("Amplifier is On");
    }

    @Override
    public void off() {
        System.out.println("Amplifier is Off");
    }

    @Override
    public void setDvd() {
        System.out.println("Amplifier dvd mode is On");
    }

    @Override
    public void setSurroundSound() {
        System.out.println("Amplifier surround sound mode is On");
    }

    @Override
    public void setVolume(int volume) {
        System.out.printf("Amplifier volume is %d%n", volume);
    }

}
