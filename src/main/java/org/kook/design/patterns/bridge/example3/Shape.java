package org.kook.design.patterns.bridge.example3;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Shape {

    protected final Color color;

    public abstract void print();

}
