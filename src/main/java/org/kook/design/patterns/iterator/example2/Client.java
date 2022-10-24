package org.kook.design.patterns.iterator.example2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final Iterable<String> iterable;

    public void printEach() {
        Iterator<String> iterator = iterable.createIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

}
