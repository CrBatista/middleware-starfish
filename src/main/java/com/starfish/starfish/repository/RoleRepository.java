package com.starfish.starfish.repository;

import com.starfish.starfish.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
