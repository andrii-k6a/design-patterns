package org.kook.design.patterns.proxy.dynamic;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PersonFactory {

    public static Person getPerson(String name) {
        return new DefaultPerson(name);
    }

    public static Person getPersonOwnerProxy(Person person) {
        return getPersonProxy(person, new OwnerInvocationHandler(person));
    }

    public static Person getPersonNonOwnerProxy(Person person) {
        return getPersonProxy(person, new NonOwnerInvocationHandler(person));
    }

    private static Person getPersonProxy(Person person, InvocationHandler invocationHandler) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                invocationHandler
        );
    }

}
