package org.kook.design.patterns.other.stream;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream<T> {

    private final Iterator<? extends T> iterator;

    public Stream(Iterator<? extends T> iterator) {
        this.iterator = iterator;
    }

    public Stream<T> filter(Predicate<? super T> predicate) {
        return new Stream<>(new ObjFilter<>(iterator, predicate));
    }

    public <R> Stream<R> map(Function<? super T, ? extends R> mapper) {
        return new Stream<>(new ObjMap<>(iterator, mapper));
    }

    public void forEach(Consumer<? super T> action) {
        while (iterator.hasNext()) {
            action.accept(iterator.next());
        }
    }

}
