package com.soni.ani;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @PostMapping ("/api/users")
    public User user() {
        System.out.println("=====> UserApiController 진입");

        User user = new User(1, "soni", "soni123", "soni@gmail.com");

        return user;
    }
}