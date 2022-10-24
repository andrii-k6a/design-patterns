package org.kook.design.patterns.state.example1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StateA implements State {

    private final Context context;

    @Override
    public void handle() {
        System.out.println("Switching to the B state...");
        State stateB = context.getStateB();
        context.setCurrentState(stateB);
    }

}
