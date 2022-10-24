package org.kook.design.patterns.observer.refactoringguru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EventManager {

    private final Map<EventType, List<EventListener>> listeners;

    public EventManager() {
        this.listeners = Arrays.stream(EventType.values())
                .collect(Collectors.toMap(Function.identity(), eventType -> new ArrayList<>()));
    }

    public void add(EventType eventType, EventListener eventListener) {
        listeners.get(eventType).add(eventListener);
    }

    public void remove(EventType eventType, EventListener eventListener) {
        listeners.get(eventType).remove(eventListener);
    }

    public void notifyListeners(EventType eventType) {
        listeners.get(eventType).forEach(EventListener::update);
    }

}
