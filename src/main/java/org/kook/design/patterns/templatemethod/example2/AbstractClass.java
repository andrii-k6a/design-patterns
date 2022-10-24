package org.kook.design.patterns.templatemethod.example2;

public abstract class AbstractClass {

    public final void templateMethod() {
        hook1();

        step1();
        step2();
        step3();

        hook2();
    }

    private void step1() {
        System.out.println("Step 1: common for all subclasses");
    }

    protected abstract void step2();

    protected abstract void step3();

    protected void hook1() {
        // do nothing by default
    }

    protected void hook2() {
        // do nothing by default
    }

}
