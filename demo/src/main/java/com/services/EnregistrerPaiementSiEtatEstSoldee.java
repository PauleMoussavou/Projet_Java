package com.services;
import com.entity.Paiement;
import com.entity.Dette;
import java.util.List;

public class EnregistrerPaiementSiEtatEstSoldee {
    
    public Dette EnregistrerPaiementSiDetteEstSoldee(int IdDette, Paiement paiement, List<Dette>dettes){
    
        for (Dette det : dettes) {
           if (det.getIdDette()==IdDette) {
            System.out.println("Le paiement a ete ajoute a votre dette");
                det.setPaiement(paiement);
                return det;
           } else {
                System.out.println("Nous n avons pas trouve de dette ayant cet identifiant");
                return null;
           } 
        }
    
       return null;
    }


}