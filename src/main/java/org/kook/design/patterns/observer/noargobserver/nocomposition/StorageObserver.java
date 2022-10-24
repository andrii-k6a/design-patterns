package org.kook.design.patterns.observer.noargobserver.nocomposition;

import org.kook.design.patterns.observer.noargobserver.nocomposition.api.Observer;

public class StorageObserver implements Observer {

    private final ObservableStorage storage;

    public StorageObserver(ObservableStorage storage) {
        this.storage = storage;
        storage.add(this);
    }

    @Override
    public void update() {
        System.out.println(storage.getValue());
    }

}
