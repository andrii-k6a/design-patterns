package org.kook.design.patterns.facade.hometheater.impl;

import org.kook.design.patterns.facade.hometheater.DvdPlayer;

public class DefaultDvdPlayer implements DvdPlayer {

    @Override
    public void on() {
        System.out.println("Dvd player is On");
    }

    @Override
    public void play(String movie) {
        System.out.printf("Dvd player is playing: %s...%n", movie);
    }

    @Override
    public void stop() {
        System.out.println("Dvd player is stopped");
    }

    @Override
    public void eject() {
        System.out.println("Dvd is ejected");
    }

    @Override
    public void off() {
        System.out.println("Dvd player is Off");
    }

}
