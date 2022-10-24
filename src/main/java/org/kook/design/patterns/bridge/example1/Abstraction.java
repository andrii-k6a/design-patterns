package org.kook.design.patterns.bridge.example1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Abstraction {

    protected final Implementor implementor;

    public abstract void makeRequest();

}
