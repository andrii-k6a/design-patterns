package org.kook.design.patterns.facade.hometheater.impl;

import org.kook.design.patterns.facade.hometheater.Screen;

public class DefaultScreen implements Screen {

    @Override
    public void up() {
        System.out.println("Screen: Up");
    }

    @Override
    public void down() {
        System.out.println("Screen: Down");
    }

}
