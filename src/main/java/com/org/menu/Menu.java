package com.org.menu;

import com.org.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Menu {
    @Autowired
    private UserRepository userRepository;

    public void run() {


    }
    private void showMenu() {
        System.out.println("1 - Create User");
        System.out.println("1 - Get User by Id");
        System.out.println("1 - Create User");
        System.out.println("1 - Create User");
        System.out.println("1 - Create User");

    }
}
