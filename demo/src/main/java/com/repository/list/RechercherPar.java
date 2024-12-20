package com.repository.list;

import java.util.List;

    public interface RechercherPar<T> {
    List<T> findAll();                
    T findBy(Object entity); 
}

