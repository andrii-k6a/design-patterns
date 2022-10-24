package org.kook.design.patterns.adapter;

import org.kook.design.patterns.adapter.thirdparty.DefaultThirdPartyService;

public class Main {
    public static void main(String[] args) {

        Client client = new Client(new ThirdPartyServiceToClientServiceAdapter(new DefaultThirdPartyService()));
        client.makeRequest();

    }
}
