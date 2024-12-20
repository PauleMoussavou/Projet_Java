package com.repository.list;
import java.util.List;

import com.entity.ClientAvecCompte;

public interface ClientAvecCompteRepositoryList extends RepositoryEntity<ClientAvecCompte>
{

    @Override
    default void create(ClientAvecCompte entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    default List<ClientAvecCompte> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    
}
