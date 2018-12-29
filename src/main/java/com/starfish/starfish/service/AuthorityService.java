package com.starfish.starfish.service;

import com.starfish.starfish.domain.Authority;
import scala.concurrent.Future;
import scala.util.Either;

import java.util.List;

public interface AuthorityService {

    List<Authority> findAllAuthorities();

}
