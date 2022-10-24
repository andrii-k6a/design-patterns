package org.kook.design.patterns.observer.composition;

import org.kook.design.patterns.observer.composition.api.SimpleObserversContainer;

public class Main {
    public static void main(String[] args) {

        State state = new State(new SimpleObserversContainer<>());
        StateObserver stateObserver = new StateObserver(state.getObserversContainer());

        state.setValue("Hello");
        state.setValue("Observer!");

    }
}
