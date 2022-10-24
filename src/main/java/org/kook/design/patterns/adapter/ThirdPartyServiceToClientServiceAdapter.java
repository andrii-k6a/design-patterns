package org.kook.design.patterns.adapter;

import lombok.RequiredArgsConstructor;
import org.kook.design.patterns.adapter.thirdparty.ThirdPartyService;

@RequiredArgsConstructor
public class ThirdPartyServiceToClientServiceAdapter implements ClientService {

    private final ThirdPartyService thirdPartyService;

    @Override
    public void request() {
        for (int i = 0; i < 5; i++) {
            thirdPartyService.specificRequest();
        }
    }

}
