package com.example.demo.app.service;

import com.example.demo.app.model.Dude;

import java.util.List;

public interface IDudesService {
    void addDude(Dude dude);

    Dude getDude(int index);

    List<Dude> getDudes();
}
