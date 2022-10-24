package org.kook.design.patterns.observer.noargobserver.composition.storage;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.observer.noargobserver.composition.api.ObserversContainer;

@RequiredArgsConstructor
public class DefaultStorage implements Storage {

    private final ObserversContainer observersContainer;
    private String value;

    @Override
    public ObserversContainer getObserversContainer() {
        return observersContainer;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
        observersContainer.notifyObservers();
    }

}
