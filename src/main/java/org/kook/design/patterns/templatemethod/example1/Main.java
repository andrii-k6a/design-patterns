package org.kook.design.patterns.templatemethod.example1;

public class Main {
    public static void main(String[] args) {

        System.out.println("*************** Making tea ******************");
        Tea tea = new Tea();
        tea.makeBeverage();

        System.out.println("*************** Making coffee ***************");
        Coffee coffee = new Coffee();
        coffee.makeBeverage();

    }
}
