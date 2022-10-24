package org.kook.design.patterns.bridge.example2;

public class BookResource implements Resource {

    @Override
    public String name() {
        return "Book title";
    }

    @Override
    public String description() {
        return "Book description";
    }

}
