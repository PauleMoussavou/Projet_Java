package com.services;

import java.util.ArrayList;
import java.util.List;

import com.entity.DemandeDette;
import com.repository.list.DemandeDetteRepositoryList;

public class ListerDemandeDette implements DemandeDetteRepositoryList {
      
    List<DemandeDette>demandeDettes= new ArrayList<>();

    @Override
    public void create(DemandeDette demdet) {
       demandeDettes.add(demdet);
       System.out.println("Nous avons ajoute une demande de dette"+demdet);
    }

    @Override
    public List<DemandeDette> findAll() {
        return demandeDettes;
    }
    
}