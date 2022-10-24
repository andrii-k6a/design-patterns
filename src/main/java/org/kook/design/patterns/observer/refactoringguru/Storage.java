package org.kook.design.patterns.observer.refactoringguru;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Storage {

    private final EventManager eventManager;
    private EventType lastEventType;
    private String value;

    public EventType getLastEventType() {
        return lastEventType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (this.value == null && value == null) {
            return;
        }

        if (this.value == null) {
            this.lastEventType = EventType.CREATE;
        } else if (value == null) {
            this.lastEventType = EventType.DELETE;
        } else {
            this.lastEventType = EventType.UPDATE;
        }

        this.value = value;
        eventManager.notifyListeners(lastEventType);
    }

}
