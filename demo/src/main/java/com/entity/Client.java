package com.entity;

public class Client {
    private int idClient;
    private String surname;
    private int telephone;
    private String adresse;
    private int montantDu;
    private User user;




    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public int getMontantDu() {
        return montantDu;
    }
    public void setMontantDu(int montantDu) {
        this.montantDu = montantDu;
    }
    public int getId() {
        return idClient;
    }
    public void setId(int id) {
        this.idClient = id;
    }
    
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    @Override
    public String toString() {
        return "Client [id=" + idClient + ", surname=" + surname + ", telephone=" + telephone + ", adresse=" + adresse + "]";
    }
    
}
