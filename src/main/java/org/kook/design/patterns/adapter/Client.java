package org.kook.design.patterns.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final ClientService clientService;

    public void makeRequest() {
        clientService.request();
    }

}
