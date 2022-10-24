package org.kook.design.patterns.adapter.thirdparty;

public class DefaultThirdPartyService implements ThirdPartyService {

    @Override
    public void specificRequest() {
        System.out.println("Doing specific request...");
    }

}
