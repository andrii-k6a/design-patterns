package org.kook.design.patterns.iterator.example2;

import lombok.RequiredArgsConstructor;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class ArrayIterator<T> implements Iterator<T> {

    private final T[] elements;
    private int cursor;

    @Override
    public boolean hasNext() {
        return cursor < elements.length && elements[cursor] != null;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T element = elements[cursor];
            cursor++;
            return element;
        }
        throw new NoSuchElementException();
    }

}
