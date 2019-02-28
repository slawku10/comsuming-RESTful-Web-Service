package com.github.slawku10.consumingrest.controller;

import com.github.slawku10.consumingrest.domain.User;
import com.github.slawku10.consumingrest.service.DELETERequestService;
import com.github.slawku10.consumingrest.service.GETRequestService;
import com.github.slawku10.consumingrest.service.POSTRequestService;
import com.github.slawku10.consumingrest.service.PUTRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    GETRequestService getRequestService;
    @Autowired
    POSTRequestService postRequestService;
    @Autowired
    PUTRequestService putRequestService;
    @Autowired
    DELETERequestService deleteRequestService;

    public User getUser(int id){
        return getRequestService.getUser(id);
    }

    public List<User> getAllUser(){
        return getRequestService.getAllUser();
    }

    public void createNewUser(User newUser){
        postRequestService.createNewUser(newUser);
    }

    public void updateUser(User updaterUser){
        putRequestService.updateUser(updaterUser);
    }

    public void deleteUser(int id){
        deleteRequestService.deleteUser(id);
    }


}
