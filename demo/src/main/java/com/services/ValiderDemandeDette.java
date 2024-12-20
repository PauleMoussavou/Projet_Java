package com.services;
import com.entity.DemandeDette;
import com.entity.Client;
import java.util.List;

public class ValiderDemandeDette {
    
    public List<DemandeDette> ValidationDemandeDette(DemandeDette demdet, Client clt, List<DemandeDette> demandeDettes){
    
        if (clt.getMontantDu()<5000000) {
            System.out.println("Votre demande de dette a ete valide");
            demandeDettes.add(demdet);
            return demandeDettes;
        } else {
            System.out.println("Votre demande de dette ne peut etre accepte");
            return null;
        }

    }

}
