package com.services;
import com.entity.Client;

import java.util.ArrayList;
import java.util.List;


public class ListerClientAvecCompteOuPas {

   public List<Client> FiltrerParUser(List<Client>clients){
         
    List<Client> clientAvecUser= new ArrayList<>();
    List<Client> clientSansUser= new ArrayList<>();

    for (Client  clt : clients) {
        if (clt.getUser()!= null) {
            System.out.println("Voici la liste des clients avec users");
            clientAvecUser.add(clt);
            
        } else {
            System.out.println("Voici la liste des clients sans users");
            clientSansUser.add(clt);
        }
    }
          return clientAvecUser;
          
   
     
 }
    
}
