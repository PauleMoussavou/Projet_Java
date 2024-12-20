package com.repository.list;

import java.util.List;
import com.entity.Client;

public interface ClientRepositoryList extends RepositoryEntity<Client> {

    @Override
    default void create(Client clt, List<Client> clients) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    default List<Client> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    

   
    
    
}
