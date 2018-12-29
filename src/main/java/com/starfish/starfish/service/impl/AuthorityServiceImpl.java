package com.starfish.starfish.service.impl;

import com.starfish.starfish.domain.Authority;
import com.starfish.starfish.repository.AuthorityRepository;
import com.starfish.starfish.service.AuthorityService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorityServiceImpl implements AuthorityService {

    private AuthorityRepository authorityRepository;

    public AuthorityServiceImpl(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    @Override
    public List<Authority> findAllAuthorities() {
        return authorityRepository.findAll();
    }

}
