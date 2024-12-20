package com.services;


import java.util.ArrayList;
import java.util.List;
import com.entity.Client;
import com.repository.list.ClientRepositoryList;

public class ListerClientServices implements ClientRepositoryList{
   List<Client> clients= new ArrayList<>();

    @Override
    public void create(Client clt,List<Client> clients ) {
        clients.add(clt);
        System.out.println("Le client a ete ajoute:"+clt);
    }

    @Override
    public List<Client> findAll() {
       return clients;
    }
}