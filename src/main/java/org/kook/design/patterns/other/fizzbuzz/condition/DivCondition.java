package org.kook.design.patterns.other.fizzbuzz.condition;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DivCondition implements Condition {

    private final int divider;

    @Override
    public boolean isTruthy(int number) {
        return number % divider == 0;
    }

}
