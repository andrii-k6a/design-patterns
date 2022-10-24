package org.kook.design.patterns.composite.example1;

public class Main {

    public static void main(String[] args) {

        Component uberComponent = createUberComponent();
        Client client = new Client(uberComponent);
        client.executeOperation();

    }

    private static Component createUberComponent() {
        Component subComponent1 = new Composite();
        subComponent1.add(new Leaf());
        subComponent1.add(new Leaf());

        Component subComponent2 = new Composite();
        subComponent2.add(new Leaf());
        subComponent2.add(new Leaf());

        Component subComponent3 = new Composite();
        subComponent3.add(new Leaf());
        subComponent3.add(new Leaf());

        Component uberComponent = new Composite();
        uberComponent.add(subComponent1);
        uberComponent.add(subComponent2);
        uberComponent.add(subComponent3);
        return uberComponent;
    }

}
