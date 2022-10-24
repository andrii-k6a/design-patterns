package org.kook.design.patterns.other.patternstogether;

import org.kook.design.patterns.other.patternstogether.factory.CountingDuckFactory;
import org.kook.design.patterns.other.patternstogether.factory.DefaultGooseFactory;
import org.kook.design.patterns.other.patternstogether.zoo.ZooSimulator;

public class Runner {
    public static void main(String[] args) {

        ZooSimulator zooSimulator = new ZooSimulator(new CountingDuckFactory(), new DefaultGooseFactory());
        zooSimulator.simulate();

    }
}
