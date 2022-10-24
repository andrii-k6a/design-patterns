package org.kook.design.patterns.iterator.example2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StringArrayIterable implements Iterable<String> {

    private final String[] strings;

    @Override
    public Iterator<String> createIterator() {
        return new ArrayIterator<>(strings);
    }

}
