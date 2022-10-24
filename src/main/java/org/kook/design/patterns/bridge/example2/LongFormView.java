package org.kook.design.patterns.bridge.example2;

public class LongFormView extends View {

    public LongFormView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return String.format("Name: %s%nDescription: %s%n", resource.name(), resource.description());
    }

}
