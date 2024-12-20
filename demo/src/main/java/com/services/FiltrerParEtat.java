package com.services;
import java.util.List;

public interface FiltrerParEtat<T> {

    List<T> FilterByState(List<T>elements,String attribut);
}