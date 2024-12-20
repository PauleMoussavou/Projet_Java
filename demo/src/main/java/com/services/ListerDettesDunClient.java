package com.services;
import com.entity.Dette;

import java.util.ArrayList;
import java.util.List;

public class ListerDettesDunClient {
    
    public List<Dette> ListerDetteParClient(List<Dette> dettes , int idClient) {
        List<Dette> dettes_2 = new ArrayList<>();
        for (Dette det : dettes) {
            if (det.getClt().getId()==idClient) {
                System.out.println("Nous avons trouve les dettes correspondantes a l id recherche");
                dettes_2.add(det);
            }
        }
        return dettes_2;
        
        
    }
    

}
