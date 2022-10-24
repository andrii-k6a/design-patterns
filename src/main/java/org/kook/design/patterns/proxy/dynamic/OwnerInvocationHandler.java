package org.kook.design.patterns.proxy.dynamic;

import lombok.RequiredArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@RequiredArgsConstructor
public class OwnerInvocationHandler implements InvocationHandler {

    private final Person person;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        switch (method.getName()) {
            case "getName":
            case "setName":
            case "getRating":
                return method.invoke(person, args);
            case "updateRating":
                throw new IllegalAccessException("You cannot update your own rating");
            default:
                throw new AssertionError("Unexpected method invocation");
        }
    }

}
