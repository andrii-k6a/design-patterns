package org.kook.design.patterns.observer.noargobserver.composition;

import org.kook.design.patterns.observer.noargobserver.composition.storage.DefaultStorage;
import org.kook.design.patterns.observer.noargobserver.composition.storage.StorageObserver;
import org.kook.design.patterns.observer.noargobserver.composition.api.SimpleObserverContainer;

public class Main {
    public static void main(String[] args) {

        DefaultStorage storage = new DefaultStorage(new SimpleObserverContainer());
        StorageObserver storageObserver = new StorageObserver(storage);

        storage.setValue("hello");
        storage.setValue("world");

    }
}
