package com.starfish.starfish.controller;

import com.starfish.starfish.service.SectionService;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/section")
public class SectionController {

    private SectionService sectionService;

    public SectionController(SectionService sectionService) {
        this.sectionService = sectionService;
    }
}
