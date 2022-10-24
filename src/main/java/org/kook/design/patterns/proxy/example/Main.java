package org.kook.design.patterns.proxy.example;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Proxy(new RealSubject());
        subject.request();
        subject.request();
        subject.request();
        subject.request();
        subject.request();

    }
}
