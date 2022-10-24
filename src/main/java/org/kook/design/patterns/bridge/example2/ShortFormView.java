package org.kook.design.patterns.bridge.example2;

public class ShortFormView extends View {

    public ShortFormView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return String.format("%s%n", resource.name());
    }

}
