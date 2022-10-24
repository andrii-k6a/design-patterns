package org.kook.design.patterns.iterator.example2;

public interface Iterable<T> {

    Iterator<T> createIterator();

}
