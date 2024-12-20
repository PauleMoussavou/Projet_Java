package com.services;
import java.util.ArrayList;
import java.util.List;

import com.entity.User;

import com.repository.list.RepositoryEntity;

public class CreerUserAvecRole implements RepositoryEntity<User>{

    List<User> users = new ArrayList<>();

    @Override
    public void create(User user) {
        users.add(user);
        System.out.println("Le user a ete ajoute:"+user);
        
    }

    @Override
    public List<User> findAll() {
        return users;
    }



   
   
}
