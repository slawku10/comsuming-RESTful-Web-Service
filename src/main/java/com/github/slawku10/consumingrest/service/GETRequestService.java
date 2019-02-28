package com.github.slawku10.consumingrest.service;

import com.github.slawku10.consumingrest.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class GETRequestService {
    @Value("${server.uri}")
    private String serverURI;
    RestTemplate restTemplate;

    public GETRequestService() {
        this.restTemplate = new RestTemplate();
    }

    public User getUser(int id) {
        String endpoint = serverURI + "?id=" + id;
        return restTemplate.getForObject(endpoint, User.class);
    }

    public List<User> getAllUser() {
        String endpoint = serverURI + "/all";
        ResponseEntity<List<User>> response =
                restTemplate.exchange(endpoint, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<User>>() {
                        });
        List<User> userList = response.getBody();
        return userList;

    }


}
