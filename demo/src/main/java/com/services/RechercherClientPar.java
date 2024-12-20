package com.services;
import java.util.List;

import com.entity.Client;

public class RechercherClientPar implements FiltrerParId<Client>{

    @Override
    public Client FilterByState(List<Client> clients, int telephone) {
       
        
        for (Client clt : clients) {
            if (clt.getTelephone() == telephone) {
                System.out.println("Le client a ete trouve");
                return clt; 
            }
        }
        System.out.println("Il n existe aucun client avec ce numero de telephone");
        return null; 
    }
       


    }
