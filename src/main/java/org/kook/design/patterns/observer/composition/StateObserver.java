package org.kook.design.patterns.observer.composition;

import org.kook.design.patterns.observer.composition.api.ObserversContainer;
import org.kook.design.patterns.observer.composition.api.Observer;

public class StateObserver implements Observer<Notification> {

    public StateObserver(ObserversContainer<Notification> observersContainer) {
        observersContainer.add(this);
    }

    @Override
    public void update(Notification notification) {
        System.out.println(notification);
    }

}
