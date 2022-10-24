package org.kook.design.patterns.proxy.dynamic;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    private final List<Person> users = List.of(
            PersonFactory.getPerson("Mark"),
            PersonFactory.getPerson("David"),
            PersonFactory.getPerson("Hanna"),
            PersonFactory.getPerson("John"),
            PersonFactory.getPerson("Suzan")
    );

    public static void main(String[] args) {
        new Runner().run();
    }

    public void run() {
        Person ownerUser = users.stream()
                .map(PersonFactory::getPersonOwnerProxy)
                .findFirst()
                .orElseThrow();

        List<Person> nonOwnerUsers = users.stream()
                .skip(1)
                .map(PersonFactory::getPersonNonOwnerProxy)
                .collect(Collectors.toList());

        System.out.println("******************* Available operations *******************");
        ownerUser.setName("Andrew");
        System.out.println("Owner name: " + ownerUser.getName());
        System.out.println("Owner rating: " + ownerUser.getRating());
        System.out.println("---------- Start processing non owner users... ----------");
        nonOwnerUsers.forEach(user -> {
            System.out.println("User name: " + user.getName());
            System.out.println("Default user rating: " + user.getRating());
            user.updateRating(10);
            System.out.println("User rating after update(+10): " + user.getRating());
            user.updateRating(50);
            System.out.println("User rating after update(+50): " + user.getRating());
            System.out.printf("---------- %s's account successfully processed ----------%n", user.getName());
        });

        System.out.println("****************** Unavailable operations ******************");
        try {
            System.out.println("Trying to update owner's rating...");
            ownerUser.updateRating(42);
        } catch (Exception e) {
            System.out.println("Error: " + e.getCause().getMessage());
        }
        try {
            System.out.println("Trying to change other users names...");
            nonOwnerUsers.forEach(user -> user.setName("New name"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getCause().getMessage());
        }
    }

}
