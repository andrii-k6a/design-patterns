package org.kook.design.patterns.facade.hometheater;

public interface DvdPlayer {

    void on();

    void play(String movie);

    void stop();

    void eject();

    void off();

}
