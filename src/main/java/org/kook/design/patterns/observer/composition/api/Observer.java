package org.kook.design.patterns.observer.composition.api;

public interface Observer<T> {

    void update(T notification);

}
