package com.entity;

public class User {
    private int idUser;
    private String email;
    private String login;
    private String password;
    private boolean actif; 
    private Role role;
    private EnumUser etat;
    private boolean active;

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public EnumUser getEtat() {
        return etat;
    }
    public void setEtat(EnumUser etat) {
        this.etat = etat;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [email=" + email + ", login=" + login + ", password=" + password + "]";
    }

    public boolean isActif() {
        return actif;
    }
    public void activer() {
        this.actif = true;
        System.out.println("Compte activé : ");
    }

    public void desactiver() {
        this.actif = false;
        System.out.println("Compte désactivé : ");
}
}
