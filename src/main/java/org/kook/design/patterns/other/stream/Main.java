package org.kook.design.patterns.other.stream;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = List.of("Hello", "World", "0_o");
        new Stream<>(strings.iterator())
                .filter(s -> !("0_o".equals(s)))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
