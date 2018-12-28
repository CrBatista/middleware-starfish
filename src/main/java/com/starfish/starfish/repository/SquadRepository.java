package com.starfish.starfish.repository;

import com.starfish.starfish.domain.Squad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SquadRepository extends JpaRepository<Squad, Long> {
}
