package org.kook.design.patterns.templatemethod.example2;

public class ConcreteClass extends AbstractClass {

    @Override
    protected void step2() {
        System.out.println("Step 2: specific for the implementation");
    }

    @Override
    protected void step3() {
        System.out.println("Step 3: specific for the implementation");
    }


    @Override
    protected void hook1() {
        System.out.println("Hook 1: specific for the implementation " +
                "(This gives subclasses the ability to “hook into” the algorithm at various points, if they wish; " +
                "a subclass is also free to ignore the hook.)");
    }

}
