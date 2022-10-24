package org.kook.design.patterns.state.example2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WinnerState implements State {

    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("Do not try to insert a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Do not try to eject a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Do not try to turn crank");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            State soldOutState = gumballMachine.getSoldOutState();
            gumballMachine.setState(soldOutState);
        } else {
            gumballMachine.releaseBall();
            System.out.println("Congrats! You're a winner!");
            if (gumballMachine.getCount() > 0) {
                State noQuarterState = gumballMachine.getNoQuarterState();
                gumballMachine.setState(noQuarterState);
            } else {
                System.out.println("Oops, out of gumballs!");
                State soldOutState = gumballMachine.getSoldOutState();
                gumballMachine.setState(soldOutState);
            }
        }
    }

}
