package org.kook.design.patterns.state.example2;

import lombok.RequiredArgsConstructor;

import java.util.concurrent.ThreadLocalRandom;

@RequiredArgsConstructor
public class HasQuarterState implements State {

    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        State noQuarterState = gumballMachine.getNoQuarterState();
        gumballMachine.setState(noQuarterState);
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = ThreadLocalRandom.current().nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            State winnerState = gumballMachine.getWinnerState();
            gumballMachine.setState(winnerState);
        } else {
            State soldState = gumballMachine.getSoldState();
            gumballMachine.setState(soldState);
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}
