package org.kook.design.patterns.state.example2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SoldState implements State {

    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        int count = gumballMachine.getCount();
        if (count == 0) {
            System.out.println("Oops, out of gumballs");
            State soldOutState = gumballMachine.getSoldOutState();
            gumballMachine.setState(soldOutState);
        } else {
            State noQuarterState = gumballMachine.getNoQuarterState();
            gumballMachine.setState(noQuarterState);
        }
    }

}
