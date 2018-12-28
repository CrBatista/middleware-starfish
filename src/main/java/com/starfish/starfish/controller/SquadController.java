package com.starfish.starfish.controller;

import com.starfish.starfish.service.SquadService;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/squad")
public class SquadController {

    private SquadService squadService;

    public SquadController(SquadService squadService) {
        this.squadService = squadService;
    }
}
