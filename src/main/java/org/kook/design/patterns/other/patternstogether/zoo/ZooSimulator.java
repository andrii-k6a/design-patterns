package org.kook.design.patterns.other.patternstogether.zoo;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.other.patternstogether.composite.Flock;
import org.kook.design.patterns.other.patternstogether.decorator.QuackCounter;
import org.kook.design.patterns.other.patternstogether.factory.DuckFactory;
import org.kook.design.patterns.other.patternstogether.factory.GooseFactory;

import java.util.List;

@RequiredArgsConstructor
public class ZooSimulator {

    private final DuckFactory duckFactory;
    private final GooseFactory gooseFactory;

    public void simulate() {
        Flock flockOfMallardDucks = new Flock(List.of(
                duckFactory.createMallardDuck(),
                duckFactory.createMallardDuck(),
                duckFactory.createMallardDuck(),
                duckFactory.createMallardDuck(),
                duckFactory.createMallardDuck()
        ));
        Flock flockOfDucks = new Flock(List.of(
                flockOfMallardDucks,
                duckFactory.createRedheadDuck(),
                duckFactory.createRubberDuck(),
                duckFactory.createDuckCall(),
                gooseFactory.createQuackableGoose()
        ));
        Flock flockOfRubberDucks = new Flock(List.of(
                duckFactory.createRubberDuck(),
                duckFactory.createRubberDuck()
        ));

        System.out.println("********** START SIMULATOR **********");


        System.out.println("-------- All ducks quacking --------");
        executeQuack(flockOfDucks);

        System.out.println("------ Mallard ducks quacking ------");
        executeQuack(flockOfMallardDucks);

        System.out.println("------ Rubber ducks quacking ------");

        Quackologist quackologist = new Quackologist();
        flockOfRubberDucks.addObserver(quackologist);

        executeQuack(flockOfRubberDucks);

        System.out.println("*********** END SIMULATOR ***********");
        System.out.println("Total number of duck quacks: " + QuackCounter.getTotalNumberOfQuacks());
    }

    private void executeQuack(Quackable quackable) {
        quackable.quack();
    }

}
