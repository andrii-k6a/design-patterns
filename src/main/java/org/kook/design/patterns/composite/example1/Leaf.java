package org.kook.design.patterns.composite.example1;

public class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println("Making something...");
    }

}
