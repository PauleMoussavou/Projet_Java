package com.entity;

import java.util.List;

public class Dette {
    private int ClientId;
    private String date;
    private  int idDette;
    private int montant;
    private int montantRestant;
    private int montantVerse;
    private Client clt;
    private EnumDette etat;
    private Paiement paiement;

    public Paiement getPaiement() {
        return paiement;
    }
    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
    public Client getClt() {
        return clt;
    }
    public void setClt(Client clt) {
        this.clt = clt;
    }
    private List<String> articles;
   
    }