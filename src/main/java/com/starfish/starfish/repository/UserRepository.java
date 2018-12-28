package com.starfish.starfish.repository;

import com.starfish.starfish.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
