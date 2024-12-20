package com.services;

import java.util.ArrayList;
import java.util.List;

import com.entity.DetteNonSoldee;
import com.repository.list.DetteNonSoldeeRepositoryList;

public class ListerDettesNonSoldeeService implements DetteNonSoldeeRepositoryList {

    List<DetteNonSoldee> detNonSoldees= new ArrayList<>();

    @Override
    public void create(DetteNonSoldee detNon) {
        detNonSoldees.add(detNon);
        System.out.println("Nous avons ajouter une dette non soldee"+detNon);
    }

    @Override
    public List<DetteNonSoldee> findAll() {
        return detNonSoldees;
    }
    
}