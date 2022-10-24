package org.kook.design.patterns.bridge.example2;

public class ArtistResource implements Resource {

    @Override
    public String name() {
        return "Artist name";
    }

    @Override
    public String description() {
        return "Artist description";
    }

}
