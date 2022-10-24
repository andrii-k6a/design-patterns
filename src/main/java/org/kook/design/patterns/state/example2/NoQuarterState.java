package org.kook.design.patterns.state.example2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NoQuarterState implements State {

    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        State hasQuarterState = gumballMachine.getHasQuarterState();
        gumballMachine.setState(hasQuarterState);
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

}
