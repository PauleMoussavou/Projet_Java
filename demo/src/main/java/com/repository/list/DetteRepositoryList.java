package com.repository.list;

import com.entity.Dette;
import java.util.List;

public interface DetteRepositoryList extends RepositoryEntity<Dette> {

    @Override
    default void create(Dette det,List<Dette> det ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    default List<Dette> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    
} 