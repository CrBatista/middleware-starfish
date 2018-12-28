package com.starfish.starfish.service;

import com.starfish.starfish.domain.Card;

import java.util.List;

public interface CardService {

    List<Card> findCardsBySquadId(Long squadId);

}
