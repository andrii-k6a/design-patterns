package org.kook.design.patterns.observer.composition.api;

public interface ObserversContainer<T> {

    void add(Observer<T> observer);
    void remove(Observer<T> observer);
    void notifyAll(T t);

}
