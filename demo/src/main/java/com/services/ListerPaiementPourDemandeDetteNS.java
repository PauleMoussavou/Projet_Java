package com.services;
import java.util.ArrayList;
import java.util.List;
import com.entity.Paiement;



public class ListerPaiementPourDemandeDetteNS implements FiltrerParEtat<Paiement> {


    @Override
    public List<Paiement> FilterByState(List<Paiement> paiements, String etat) {
        List<Paiement> paiements_2= new ArrayList<>();
        for (Paiement paiement : paiements) {
        if (paiement.getDemdet().getEtat().name()==etat) {
            System.out.println("Nous avons trouve les paiements associes a l etat de cette demande de dette");
            paiements_2.add(paiement);
        } else {
            return null;
        }
   }
   return paiements_2;
    }
}

