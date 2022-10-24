package org.kook.design.patterns.other.fizzbuzz.rule;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.kook.design.patterns.other.fizzbuzz.condition.Condition;

@AllArgsConstructor
@Getter
public class DefaultRule implements Rule {

    private final Tag tag;
    private final Condition condition;

    @Override
    public boolean isSuccess(int number) {
        return condition.isTruthy(number);
    }

    @Override
    public String getTagValue() {
        return tag.getValue();
    }

}
