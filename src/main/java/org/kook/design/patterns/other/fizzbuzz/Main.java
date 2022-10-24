package org.kook.design.patterns.other.fizzbuzz;

import org.kook.design.patterns.other.fizzbuzz.condition.AllMatchCondition;
import org.kook.design.patterns.other.fizzbuzz.condition.DivCondition;
import org.kook.design.patterns.other.fizzbuzz.printer.ConsolePrinter;
import org.kook.design.patterns.other.fizzbuzz.rule.DefaultRule;
import org.kook.design.patterns.other.fizzbuzz.rule.Tag;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FizzBuzzApp app = new FizzBuzzApp(
                42,
                List.of(
                        new DefaultRule(new Tag("FizzBuzz"), new AllMatchCondition(List.of(new DivCondition(3), new DivCondition(5)))),
                        new DefaultRule(new Tag("Fizz"), new DivCondition(3)),
                        new DefaultRule(new Tag("Buzz"), new DivCondition(5))
                ),
                new ConsolePrinter()
        );
        app.run();
    }

}
