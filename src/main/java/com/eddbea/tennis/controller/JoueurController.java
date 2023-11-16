package com.eddbea.tennis.controller;

import com.eddbea.tennis.entity.Joueur;
import com.eddbea.tennis.service.JoueurService;

import java.util.Scanner;

public class JoueurController {

    Scanner scanner = new Scanner(System.in);
    private JoueurService joueurService;

    public JoueurController() {
        this.joueurService = new JoueurService();
    }

    public void afficherDetailsJoueur() {
        System.out.println("Quel est l'identifiant du joueur dont vous voulez afficher les informations ?");
        long identifiant = scanner.nextLong();
        Joueur joueur = joueurService.getJoueur(identifiant);
        System.out.println("Le joueur selectionne s'appelle " + joueur.getPrenom() + " " + joueur.getNom());
    }

    public void creerJoueur() {
        Joueur joueurNouveau = new Joueur();
        System.out.println("Quel est le nom du joueur que vous souhaitez creer");
        String nomJoueur = scanner.nextLine();
        joueurNouveau.setNom(nomJoueur);
        System.out.println("Quel est le prenom du joueur que vous souhaitez creer");
        String prenomJoueur = scanner.nextLine();
        joueurNouveau.setPrenom(prenomJoueur);
        System.out.println("Quel est le sexe du joueur que vous souhaitez creer");
        char sexeJoueur = scanner.nextLine().charAt(0);
        joueurNouveau.setSexe(sexeJoueur);
        joueurService.createJoueur(joueurNouveau);
        System.out.println("Le joueur a ete cree, son identifiant est = "+joueurNouveau.getId());
    }
    public void renommeJoueur() {
        System.out.println("Quel est l'identifiant du joueur que vous voulez renommer ?");
        long identifiant = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Quel est le nouveau nom que vous voulez enregistrer ?");
        String nouveauNom = scanner.nextLine();
        joueurService.renomme(identifiant,nouveauNom);
        System.out.println("Le nouveau nom du joueur enregistre est desormais :  "+nouveauNom );
    }
}
