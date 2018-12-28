package com.starfish.starfish.service.impl;

import com.starfish.starfish.domain.Card;
import com.starfish.starfish.repository.CardRepository;
import com.starfish.starfish.service.CardService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CardServiceImpl implements CardService {

    private CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public List<Card> findCardsBySquadId(Long squadId) {
        return cardRepository.findCardBySquadId(squadId);
    }
}
