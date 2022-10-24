package org.kook.design.patterns.observer.noargobserver.composition.storage;

import org.kook.design.patterns.observer.noargobserver.composition.api.Observer;

public class StorageObserver implements Observer {

    private final Storage storage;

    public StorageObserver(Storage storage) {
        this.storage = storage;
        storage.getObserversContainer().add(this);
    }

    @Override
    public void update() {
        System.out.println(storage.getValue());
    }

}
