package org.kook.design.patterns.facade;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.facade.hometheater.Amplifier;
import org.kook.design.patterns.facade.hometheater.DvdPlayer;
import org.kook.design.patterns.facade.hometheater.PopcornPopper;
import org.kook.design.patterns.facade.hometheater.Projector;
import org.kook.design.patterns.facade.hometheater.Screen;
import org.kook.design.patterns.facade.hometheater.TheaterLights;

@RequiredArgsConstructor
public class DefaultHomeTheaterFacade implements HomeTheaterFacade {

    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final TheaterLights theaterLights;
    private final Screen screen;
    private final PopcornPopper popcornPopper;

    @Override
    public void watchMovie(String movie) {
        System.out.println("***************************** Get ready to watch movie *****************************");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd();
        amplifier.setSurroundSound();
        amplifier.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    @Override
    public void endMovie() {
        System.out.println("**************************** Shutting movie theater down ****************************");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

}
