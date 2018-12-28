package com.starfish.starfish.controller;

import com.starfish.starfish.domain.Card;
import com.starfish.starfish.service.CardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cards")
public class CardController {

    private CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/squad/{squadId}")
    public ResponseEntity<List<Card>> findCardBySquadId(@PathVariable String squadId) {
        return new ResponseEntity<>(cardService.findCardsBySquadId(Long.parseLong(squadId)), HttpStatus.ACCEPTED);
    }
}
