package org.kook.design.patterns.other.fizzbuzz;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.other.fizzbuzz.rule.Rule;
import org.kook.design.patterns.other.fizzbuzz.printer.Printer;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class FizzBuzzApp {

    private static final String NO_VALUE_RESULT = "No result";

    private final int number;
    private final List<Rule> rules;
    private final Printer printer;

    public void run() {
        Optional<String> value = rules.stream()
                .filter(rule -> rule.isSuccess(number))
                .map(Rule::getTagValue)
                .findFirst();

        value.ifPresentOrElse(printer::print, () -> printer.print(NO_VALUE_RESULT));
    }

}
