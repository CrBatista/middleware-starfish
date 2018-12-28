package com.starfish.starfish.controller;

import com.starfish.starfish.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
