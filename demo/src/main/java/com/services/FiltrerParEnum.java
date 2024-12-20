package com.services;

import java.util.List;

public interface FiltrerParEnum<T, E extends Enum<E>> {
    
    T rechercherParElementEnum(List<T> elements, E attribut);
}
