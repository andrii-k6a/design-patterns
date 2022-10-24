package org.kook.design.patterns.composite.example1;

public interface Component {

    void operation();

    default void add(Component component) {
        throw new UnsupportedOperationException();
    }

    default void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    default Component getChild(int i) {
        throw new UnsupportedOperationException();
    }

}
