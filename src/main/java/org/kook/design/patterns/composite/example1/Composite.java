package org.kook.design.patterns.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final List<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        components.forEach(Component::operation);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

}
