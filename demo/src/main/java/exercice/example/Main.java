package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Client> clients= new ArrayList<>();
        ListerClientServices cltService = new ListerClientServices();
        RechercherClientPar recherche= new RechercherClientPar();
        ListerDettesServices detService= new ListerDettesServices();
        EnregistrerPaiementSiEtatEstSoldee registerPaiement= new EnregistrerPaiementSiEtatEstSoldee();
        ListerDettesNonSoldeeService detNon= new ListerDettesNonSoldeeService();
        ListerDemandesDettesDunClient demDetClient=new ListerDemandesDettesDunClient();
        ListerDemandeDette demDet= new ListerDemandeDette();
        FaireDemandeDeDette faireDemande= new FaireDemandeDeDette();
        
        int choix;

        do {

            System.out.println("MENU PRINCIPAL");
            System.out.println("1-Boutiquier");
            System.out.println("2-Admin");
            System.out.println("3-Client");
            System.out.println("Entrez votre choix");
            choix= scanner.nextInt();

            switch (choix) {
                case 1:
                System.out.println("Menu Boutiquier");
                int choix1;
                do {
                    System.out.println("1-Creer un client");
                    System.out.println("2-Lister Client");
                    System.out.println("3-Lister les informations d un client");
                    System.out.println("4-Creer une dette");
                    System.out.println("5-Enregistrer un paiement");
                    System.out.println("6-Lister les dettes non soldees");
                    System.out.println("7-Lister les demandes de dettes en cours");
                    choix1=scanner.nextInt();
                    switch (choix1) {
                        case 1:
                             cltService.create();

                            break;
                        case 2:
                             cltService.findAll();

                            break;
                        case 3:
                            int num;
                            System.out.println("Entrez le numero du client que vous recherchez");
                            num=scanner.nextInt();
                            recherche.FilterByState();
                            break;
                        case 4:
                            detService.create();
                            break;
                        case 5:
                            registerPaiement.EnregistrerPaiementSiDetteEstSoldee();
                            break;
                        case 6:
                            detNon.findAll();
                            break;
                        case 7:
                            demDetClient.FilterByState();
                            break;
                    
                        default:
                            break;
                    }

                } while (choix1<1 || choix1>7);    
                    break;
                case 2:
                System.out.println("Menu Admin");  
                int choix2;
                do {
                    System.out.println("1-Creer un compte utilisateur a un client");
                    System.out.println("2-Creer un compte utilisateur avec un role de votre choix(Admin ou Boutiquier)");
                    System.out.println("3-Desactiver/Activer un compte utlisateur");
                    System.out.println("4-Afficher les comptes par etat");
                    System.out.println("5-Effectuer des operations sur les articles");
                    System.out.println("6-Mettre a jour la quantite en stock d un article");
                    System.out.println("7-Archiver les dettes soldees");
                    choix2=scanner.nextInt();
                    switch(choix2){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                }
                } while (choix2<1 || choix2>7);
                    break;
                case 3:
                System.out.println("Menu Client");
                int choix3;
                do {
                    System.out.println("1-Lister les dettes non soldees");
                    System.out.println("2-Faire une demande de dette");
                    System.out.println("3-Lister les demandes de dettes");
                    System.out.println("4-Vouloir relancer une demande de dette annulee");
                    choix3=scanner.nextInt();
                    switch(choix3){
                        case 1:
                            detNon.findAll();
                            break;
                        case 2:
                            faireDemande.create();
                            break;
                        case 3:
                            demDet.findAll();
                            break;
                        case 4:
                            break;
                }
                } while (choix3<1 || choix3>4);    
                    break;
            
                default:
                    break;
            }

        } while ( choix<1 || choix>4 ) ;

    scanner.close();

    }
    
    
        
}