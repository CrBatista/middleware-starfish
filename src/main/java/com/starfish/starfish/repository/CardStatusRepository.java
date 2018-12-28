package com.starfish.starfish.repository;

import com.starfish.starfish.domain.CardStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardStatusRepository extends JpaRepository<CardStatus, Long> {
}
