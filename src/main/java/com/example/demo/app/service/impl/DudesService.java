package com.example.demo.app.service.impl;

import com.example.demo.app.service.IDudesService;
import com.example.demo.app.dao.IDudesDao;
import com.example.demo.app.model.Dude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DudesService implements IDudesService {
    private final IDudesDao dudesDao;

    @Autowired
    public DudesService(IDudesDao dudesDao) {
        this.dudesDao = dudesDao;
    }

    @Override
    public void addDude(Dude dude) {
        dudesDao.addDude(dude);
    }

    @Override
    public Dude getDude(int index) {
        try {
            return dudesDao.getDude(index);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("No such dude");
        }
    }

    @Override
    public List<Dude> getDudes() {
        return dudesDao.getDudes();
    }
}
