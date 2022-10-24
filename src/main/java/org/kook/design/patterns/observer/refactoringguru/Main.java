package org.kook.design.patterns.observer.refactoringguru;

public class Main {
    public static void main(String[] args) {

        EventManager eventManager = new EventManager();
        Storage storage = new Storage(eventManager);
        StorageListener storageListener = new StorageListener(storage);
        eventManager.add(EventType.CREATE, storageListener);
        eventManager.add(EventType.UPDATE, storageListener);
        eventManager.add(EventType.DELETE, storageListener);

        storage.setValue("Create");
        storage.setValue("Update1");
        storage.setValue("Update2");
        storage.setValue("Update3");
        storage.setValue(null);

    }
}
