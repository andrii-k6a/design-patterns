package org.kook.design.patterns.proxy.dynamic;

import lombok.RequiredArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@RequiredArgsConstructor
public class NonOwnerInvocationHandler implements InvocationHandler {

    private final Person person;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        switch (method.getName()) {
            case "getName":
            case "updateRating":
            case "getRating":
                return method.invoke(person, args);
            case "setName":
                throw new IllegalAccessException("You cannot change name of other person");
            default:
                throw new AssertionError("Unexpected method invocation");
        }
    }

}
