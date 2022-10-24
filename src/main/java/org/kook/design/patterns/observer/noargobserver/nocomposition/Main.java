package org.kook.design.patterns.observer.noargobserver.nocomposition;

public class Main {
    public static void main(String[] args) {

        SimpleObservableStorage storage = new SimpleObservableStorage();
        StorageObserver storageObserver = new StorageObserver(storage);

        storage.setValue("hello");
        storage.setValue("world");

    }
}
