package org.kook.design.patterns.other.stream;

import lombok.RequiredArgsConstructor;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

@RequiredArgsConstructor
public class ObjFilter<T> implements Iterator<T> {

    private final Iterator<? extends T> iterator;
    private final Predicate<? super T> predicate;

    private boolean hasNext;
    private boolean hasNextEvaluated;
    private T next;

    @Override
    public boolean hasNext() {
        if (!hasNextEvaluated) {
            nextIteration();
            hasNextEvaluated = true;
        }
        return hasNext;
    }

    @Override
    public T next() {
        if (!hasNextEvaluated) {
            hasNext = hasNext();
        }
        if (!hasNext) {
            throw new NoSuchElementException();
        }
        hasNextEvaluated = false;
        return next;
    }

    private void nextIteration() {
        while (iterator.hasNext()) {
            next = iterator.next();
            if (predicate.test(next)) {
                hasNext = true;
                return;
            }
        }
        hasNext = false;
    }

}
