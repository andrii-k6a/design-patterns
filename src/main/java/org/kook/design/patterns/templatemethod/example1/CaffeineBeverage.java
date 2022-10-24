package org.kook.design.patterns.templatemethod.example1;

public abstract class CaffeineBeverage {

    // it's a template method
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // it's a hook because the subclass can override this method, but doesn't have to
    protected boolean customerWantsCondiments() {
        return true;
    }

}
