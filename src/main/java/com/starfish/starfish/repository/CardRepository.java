package com.starfish.starfish.repository;

import com.starfish.starfish.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {

    List<Card> findCardBySquadId(Long squadId);

}
