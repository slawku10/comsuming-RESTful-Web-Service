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
        userController.createNewUser(new User(4, "Adam", "Kowalski", "Poland"));

        System.out.println("Return all user: ");
        for (User u :
                userController.getAllUser()) {
            System.out.println(u);
        }
    }
}
