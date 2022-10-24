package org.kook.design.patterns.state.example2;

public class Main {
    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}
