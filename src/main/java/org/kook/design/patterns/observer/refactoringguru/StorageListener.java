package org.kook.design.patterns.observer.refactoringguru;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StorageListener implements EventListener {

    private final Storage storage;

    @Override
    public void update() {
        System.out.println(storage.getLastEventType() + " : " + storage.getValue());
    }

}
