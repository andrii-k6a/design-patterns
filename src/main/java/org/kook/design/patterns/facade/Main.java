package org.kook.design.patterns.facade;

import org.kook.design.patterns.facade.hometheater.impl.DefaultAmplifier;
import org.kook.design.patterns.facade.hometheater.impl.DefaultDvdPlayer;
import org.kook.design.patterns.facade.hometheater.impl.DefaultPopcornPopper;
import org.kook.design.patterns.facade.hometheater.impl.DefaultProjector;
import org.kook.design.patterns.facade.hometheater.impl.DefaultScreen;
import org.kook.design.patterns.facade.hometheater.impl.DefaultTheaterLights;

public class Main {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new DefaultHomeTheaterFacade(
                new DefaultAmplifier(),
                new DefaultDvdPlayer(),
                new DefaultProjector(),
                new DefaultTheaterLights(),
                new DefaultScreen(),
                new DefaultPopcornPopper()
        );

        homeTheaterFacade.watchMovie("Pulp Fiction");
        homeTheaterFacade.endMovie();

    }
}
