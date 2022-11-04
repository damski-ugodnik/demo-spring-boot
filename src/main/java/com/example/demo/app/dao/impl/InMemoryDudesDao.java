package com.example.demo.app.dao.impl;

import com.example.demo.app.dao.IDudesDao;
import com.example.demo.app.model.Dude;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDudesDao implements IDudesDao {
    private final List<Dude> dudeList = new ArrayList<>() {{
        add(new Dude("S", "FSharp"));
        add(new Dude("R", "Ruby"));
    }};

    @Override
    public void addDude(Dude dude) {
        dudeList.add(dude);
    }

    @Override
    public Dude getDude(int index) {
        return dudeList.get(index);
    }

    @Override
    public List<Dude> getDudes() {
        return dudeList;
    }
}
