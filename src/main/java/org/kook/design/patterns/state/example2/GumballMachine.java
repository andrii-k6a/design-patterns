package org.kook.design.patterns.state.example2;

import lombok.Getter;

@Getter
public class GumballMachine {

    private final State soldOutState = new SoldOutState(this);
    private final State noQuarterState = new NoQuarterState(this);
    private final State hasQuarterState = new HasQuarterState(this);
    private final State soldState = new SoldState(this);
    private final State winnerState = new WinnerState(this);

    private State state = noQuarterState;
    private int count;

    public GumballMachine(int count) {
        if (count <= 0) {
            throw new IllegalStateException();
        }
        this.count = count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    // helper method
    void setState(State state) {
        this.state = state;
    }

    // helper method
    void releaseBall() {
        if (count > 0) {
            System.out.println("A gumball comes rolling out the slot...");
            count--;
        }
    }

}
