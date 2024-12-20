package com.services;

import java.util.ArrayList;
import java.util.List;

import com.entity.Dette;
import com.repository.list.DetteRepositoryList;

public class ListerDettesServices implements DetteRepositoryList{

    List<Dette> dettes = new ArrayList<>();

    @Override
    public void create(Dette det, List<Dette> dettes) {
       dettes.add(det);
       System.out.println("Nous avons ajouter une dettes"+det);
    }
  
    @Override
    public List<Dette> findAll() {
        return dettes;
    }
    
}
