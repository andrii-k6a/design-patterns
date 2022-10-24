package org.kook.design.patterns.state.example1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StateB implements State {

    private final Context context;

    @Override
    public void handle() {
        System.out.println("Switching to the A state...");
        State stateA = context.getStateA();
        context.setCurrentState(stateA);
    }

}
