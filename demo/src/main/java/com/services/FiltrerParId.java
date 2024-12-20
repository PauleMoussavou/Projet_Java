package com.services;

import java.util.List;

public interface FiltrerParId <T>{
    
     T FilterByState(List<T>elements,int attribut);

}