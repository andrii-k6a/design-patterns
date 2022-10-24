package org.kook.design.patterns.command.example2.thirdparty.impl;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.command.example2.thirdparty.Stereo;

@RequiredArgsConstructor
public class SimpleStereo implements Stereo {

    private final String location;

    @Override
    public void on() {
        System.out.println("Stereo is On. Location: " + location);
    }

    @Override
    public void off() {
        System.out.println("Stereo is Off. Location: " + location);
    }

    @Override
    public void setCd() {
        System.out.println("Stereo mode is CD. Location: " + location);
    }

    @Override
    public void setDvd() {
        System.out.println("Stereo mode is DVD. Location: " + location);
    }

    @Override
    public void setRadio() {
        System.out.println("Stereo mode is Radio. Location: " + location);
    }

}
