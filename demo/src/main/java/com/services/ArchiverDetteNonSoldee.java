package com.services;
import java.util.ArrayList;
import java.util.List;


import com.entity.DetteNonSoldee;

public class ArchiverDetteNonSoldee {

    List<DetteNonSoldee> dettesArchivee= new ArrayList<>();

    public  List<DetteNonSoldee> ArchiverDette(List<DetteNonSoldee> detNonSoldee ,int idDetNon){
        for (DetteNonSoldee detNon : detNonSoldee) {
            if (detNon.getIdDetteNon()==idDetNon) {
                System.out.println("La dette non soldee pour cet id a ete archive");
                detNonSoldee.remove(detNon);
                dettesArchivee.add(detNon);
            } else {
                
            }
        }
        return detNonSoldee;
    }
}