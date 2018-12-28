package com.starfish.starfish.controller;

import com.starfish.starfish.service.AuthorityService;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/authority")
public class AuthorityController {

    private AuthorityService authorityService;

    public AuthorityController(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }
}
