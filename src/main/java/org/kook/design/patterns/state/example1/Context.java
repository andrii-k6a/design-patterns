package org.kook.design.patterns.state.example1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {

    private final State stateA = new StateA(this);
    private final State stateB = new StateB(this);

    private State currentState;

    public Context() {
        this.currentState = stateA;
    }

    public void request() {
        currentState.handle();
    }

}
