package com.github.slawku10.consumingrest.controller;

import com.github.slawku10.consumingrest.domain.User;
import com.github.slawku10.consumingrest.service.GETRequestService;
import com.github.slawku10.consumingrest.service.POSTRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    GETRequestService getRequestService;
    @Autowired
    POSTRequestService postRequestService;

    public User getUser(int id){
        return getRequestService.getUser(id);
    }

    public List<User> getAllUser(){
        return getRequestService.getAllUser();
    }

    public void createNewUser(User newUser){
        postRequestService.createNewUser(newUser);
    }
}
