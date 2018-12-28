package com.starfish.starfish.controller;

import com.starfish.starfish.domain.Card;
import com.starfish.starfish.service.CardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/card")
public class CardController {

    private CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/hello")
    public String greeting() {
        return "Hello";
    }

    @GetMapping("/squad/{squadId}")
    public ResponseEntity<List<Card>> findCardBySquadId(@PathVariable Long squadId) {
        return new ResponseEntity<>(cardService.findCardsBySquadId(squadId), HttpStatus.ACCEPTED);
    }
}
