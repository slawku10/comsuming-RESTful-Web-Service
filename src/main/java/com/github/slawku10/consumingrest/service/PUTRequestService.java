package com.github.slawku10.consumingrest.service;

import com.github.slawku10.consumingrest.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class PUTRequestService {

    @Value("${server.uri}")
    String serverURI;

    RestTemplate restTemplate;

    public PUTRequestService() {
        this.restTemplate = new RestTemplate();
    }

    public void updateUser(User updaterUser) {
        String endpoint = serverURI + "/update-user";
        restTemplate.put(endpoint, updaterUser);
    }
}
