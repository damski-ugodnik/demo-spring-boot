package com.example.demo.app.controller;

import com.example.demo.app.model.Dude;
import com.example.demo.app.service.IDudesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("controller/dude")
@RestController
public class DudesController {
    private final IDudesService dudesService;

    @Autowired
    public DudesController(IDudesService dudesService) {
        this.dudesService = dudesService;
    }

    @GetMapping
    public Dude getDude(int index) {
        return dudesService.getDude(index);
    }
}
