package org.kook.design.patterns.bridge.example2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class View {

    protected final Resource resource;

    public abstract String show();

}
