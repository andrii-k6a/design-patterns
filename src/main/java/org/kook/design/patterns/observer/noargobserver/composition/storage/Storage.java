package org.kook.design.patterns.observer.noargobserver.composition.storage;

import org.kook.design.patterns.observer.noargobserver.composition.api.ObserversContainer;

public interface Storage {

    ObserversContainer getObserversContainer();

    String getValue();

    void setValue(String value);

}
