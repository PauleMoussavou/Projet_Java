package com.services;

import com.entity.DemandeDette;

import java.util.ArrayList;

import java.util.List;

public class ListerDemandesDettesDunClient  {

    public List<DemandeDette> FilterByState(List<DemandeDette> demandeDettes, int idClient) {
        List<DemandeDette> demandeDettes2=new ArrayList<>();
       for ( DemandeDette demdet : demandeDettes) {
           if (demdet.getClt().getId()==idClient) {
            System.out.println("Les demandes de dettes liees a ce client ont ete trouves");
            demandeDettes2.add(demdet);
           } else {
                return null;
           }
       }
        return demandeDettes2;
    }

   
    
}
