package org.kook.design.patterns.other.stream;

import lombok.RequiredArgsConstructor;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

@RequiredArgsConstructor
public class ObjMap<T, R> implements Iterator<R> {

    private final Iterator<? extends T> iterator;
    private final Function<? super T, ? extends R> mapper;

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public R next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return mapper.apply(iterator.next());
    }

}
