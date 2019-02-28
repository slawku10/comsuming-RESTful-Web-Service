package com.github.slawku10.consumingrest.service;

import com.github.slawku10.consumingrest.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class POSTRequestService {
    @Value("${server.uri}")
    String serverURI;

    RestTemplate restTemplate;

    public POSTRequestService() {
        this.restTemplate = new RestTemplate();
    }

    public void createNewUser(User newUser){
        String endpoint = serverURI + "/create-new-user";
        User tempUser = new User();
        tempUser.setId(5);
        tempUser.setName("adam");
        tempUser.setLastName("Kowalski");
        tempUser.setCountry("Poland");
        restTemplate.postForEntity(endpoint, newUser, List.class);
    }
}
