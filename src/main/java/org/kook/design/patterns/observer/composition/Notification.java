package org.kook.design.patterns.observer.composition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Notification {

    private final String id;
    private final String value;

}
