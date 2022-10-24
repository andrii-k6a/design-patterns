package org.kook.design.patterns.facade.hometheater.impl;

import org.kook.design.patterns.facade.hometheater.Projector;

public class DefaultProjector implements Projector {

    @Override
    public void on() {
        System.out.println("Projector is On");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("Projector wide screen mode is On");
    }

    @Override
    public void off() {
        System.out.println("Projector is Off");
    }

}
