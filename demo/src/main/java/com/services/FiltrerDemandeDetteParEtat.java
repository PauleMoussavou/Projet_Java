package com.services;

import java.util.ArrayList;
import java.util.List;
import com.entity.DemandeDette;


public class FiltrerDemandeDetteParEtat implements FiltrerParEtat<DemandeDette> {


    @Override
    public List<DemandeDette> FilterByState(List<DemandeDette> demandeDettes, String etat) {
        
        List<DemandeDette> demandeDettes2= new ArrayList<>();

        for ( DemandeDette demdet : demandeDettes) {
            if (demdet.getEtat().name().equalsIgnoreCase(etat)) {
                System.out.println("Les demandes de dettes correspond a cet etat ont ete trouve");
                demandeDettes2.add(demdet);
            } else {
                return null;
           }
        }
            return demandeDettes2;
    }
       
    }
