package com.example.demo.app.controller;

import com.example.demo.app.model.Dude;
import com.example.demo.app.service.IDudesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("management/controller/dude")
public class DudesManagementController {
    private final IDudesService dudesService;

    @Autowired
    public DudesManagementController(IDudesService dudesService) {
        this.dudesService = dudesService;
    }

    @GetMapping
    public List<Dude> getDudes() {
        return dudesService.getDudes();
    }

    @PostMapping
    public String addDude(@RequestBody Dude dude) {
        dudesService.addDude(dude);
        return "OK" + " dude name:" + dude.getName();
    }
}
