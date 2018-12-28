package com.starfish.starfish.controller;

import com.starfish.starfish.service.CardStatusService;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/card-status")
public class CardStatusController {

    private CardStatusService cardStatusService;

    public CardStatusController(CardStatusService cardStatusService) {
        this.cardStatusService = cardStatusService;
    }
}
