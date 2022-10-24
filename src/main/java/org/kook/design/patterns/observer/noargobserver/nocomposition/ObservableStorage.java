package org.kook.design.patterns.observer.noargobserver.nocomposition;

import org.kook.design.patterns.observer.noargobserver.nocomposition.api.Observable;

public interface ObservableStorage extends Observable {

    String getValue();

    void setValue(String value);

}
