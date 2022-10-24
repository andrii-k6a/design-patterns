package org.kook.design.patterns.state.example2;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    // just an internal action
    void dispense();

}
