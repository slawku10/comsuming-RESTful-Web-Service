package com.github.slawku10.consumingrest;

import com.github.slawku10.consumingrest.controller.UserController;
import com.github.slawku10.consumingrest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    @Autowired
    UserController userController;
    private User newUser;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Return user with ID=1: ");
        System.out.println(userController.getUser(1));
        System.out.println();
        System.out.println("Return all user: ");
        for (User u :
                userController.getAllUser()) {
            System.out.println(u);
        }

        System.out.println("Dodawnie nowego usera");
        newUser = new User(4, "Adam", "Kowalski", "Poland");
        userController.createNewUser(newUser);

        System.out.println("Return all user: ");
        for (User u :
                userController.getAllUser()) {
            System.out.println(u);
        }
        User updaterUser =  newUser;
        updaterUser.setLastName("Wójcicki");
        System.out.println("Update");
        userController.updateUser(updaterUser);
        userController.deleteUser(1);
        for (User u :
                userController.getAllUser()) {
            System.out.println(u);
        }

    }
}
