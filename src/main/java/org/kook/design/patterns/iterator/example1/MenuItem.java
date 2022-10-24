package org.kook.design.patterns.iterator.example1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Builder
@ToString
public class MenuItem {

    private final String name;
    private final Double price;

}
