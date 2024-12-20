package com.services;

import java.util.List;
import com.entity.Dette;
import com.entity.EnumDette;

public class FiltrerDetteParEtat implements FiltrerParEnum<Dette, EnumDette>{

    @Override
    public Dette rechercherParElementEnum(List<Dette> dettes, EnumDette attribut) {
        for (Dette det : dettes) {
            if (det.getEtat()) {
                
            }
        }
        return null;
    }

    
    
}
