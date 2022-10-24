package org.kook.design.patterns.iterator.example2;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"Hello", " ", "World", "!"};
        Client client = new Client(new StringArrayIterable(strings));
        client.printEach();

    }
}
