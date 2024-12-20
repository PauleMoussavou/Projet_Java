package com.entity;

public class DetteNonSoldee {
    private int ClientId;
    private String date;
    private  int idDetteNon;
    private int montant;
    private int montantRestant;
    private int montantVerse;
    private Paiement paiement;
    private EnumDette etat;

    public int getIdDetteNon() {
        return idDetteNon;
    }
    public void setIdDetteNon(int idDetteNon) {
        this.idDetteNon = idDetteNon;
    }
    public EnumDette getEtat() {
        return etat;
    }
    public void setEtat(EnumDette etat) {
        this.etat = etat;
    }
    public int getClientId() {
        return ClientId;
    }
    public void setClientId(int clientId) {
        ClientId = clientId;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
   
    public int getMontant() {
        return montant;
    }
    public void setMontant(int montant) {
        this.montant = montant;
    }
    public int getMontantRestant() {
        return montantRestant;
    }
    public void setMontantRestant(int montantRestant) {
        this.montantRestant = montantRestant;
    }
    public int getMontantVerse() {
        return montantVerse;
    }
    public void setMontantVerse(int montantVerse) {
        this.montantVerse = montantVerse;
    }
    public Paiement getPaiement() {
        return paiement;
    }
    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
    @Override
    public String toString() {
        return "DetteNonSoldee [ClientId=" + ClientId + ", date=" + date + ", idDette=" + idDetteNon + ", montant="
                + montant + ", montantRestant=" + montantRestant + ", montantVerse=" + montantVerse + ", paiement="
                + paiement + "]";
    }
}
