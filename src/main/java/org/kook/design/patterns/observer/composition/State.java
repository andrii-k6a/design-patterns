package org.kook.design.patterns.observer.composition;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.observer.composition.api.ObserversContainer;

import java.util.UUID;

@RequiredArgsConstructor
public class State {

    private final ObserversContainer<Notification> observersContainer;
    private String value;

    public ObserversContainer<Notification> getObserversContainer() {
        return observersContainer;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        Notification notification = Notification.builder()
                .id(String.valueOf(UUID.randomUUID()))
                .value(value)
                .build();
        observersContainer.notifyAll(notification);
    }

}
