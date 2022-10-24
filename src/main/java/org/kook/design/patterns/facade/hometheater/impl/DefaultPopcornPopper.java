package org.kook.design.patterns.facade.hometheater.impl;

import org.kook.design.patterns.facade.hometheater.PopcornPopper;

public class DefaultPopcornPopper implements PopcornPopper {

    @Override
    public void on() {
        System.out.println("Popcorn popper is On");
    }

    @Override
    public void pop() {
        System.out.println("Popcorn popper is popping...");
    }

    @Override
    public void off() {
        System.out.println("Popcorn popper is Off");
    }

}
