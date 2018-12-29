package com.starfish.starfish.controller;

import com.starfish.starfish.domain.Authority;
import com.starfish.starfish.service.AuthorityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/authority")
public class AuthorityController {

    private AuthorityService authorityService;

    public AuthorityController(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }

    @GetMapping
    public List<Authority> findAllAuthorities() {
        return authorityService.findAllAuthorities();
    }
}
