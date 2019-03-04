package com.github.slawku10.consumingrest.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DELETERequestService {
    RestTemplate restTemplate;
    @Value("${server.uri}")
    String serverURI;

    public DELETERequestService() {
        restTemplate = new RestTemplate();
    }

    public void deleteUser(int id){
        String endpoint = serverURI +"/delete-user?id="+id;
        restTemplate.delete(endpoint);
    }
}
