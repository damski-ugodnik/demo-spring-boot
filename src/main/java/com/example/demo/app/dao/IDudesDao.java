package com.example.demo.app.dao;

import com.example.demo.app.model.Dude;

import java.util.List;

public interface IDudesDao {
    void addDude(Dude dude);

    Dude getDude(int index);

    List<Dude> getDudes();
}
