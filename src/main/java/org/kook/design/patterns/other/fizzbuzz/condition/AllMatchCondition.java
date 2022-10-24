package org.kook.design.patterns.other.fizzbuzz.condition;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AllMatchCondition implements Condition {

    private final List<Condition> conditions;

    @Override
    public boolean isTruthy(int number) {
        return conditions.stream()
                .allMatch(condition -> condition.isTruthy(number));
    }

}
