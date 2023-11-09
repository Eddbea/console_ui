package com.eddbea.tennis.controller;

import com.eddbea.tennis.entity.Joueur;
import com.eddbea.tennis.service.JoueurService;

import java.util.Scanner;

public class JoueurController {

    private JoueurService joueurService;

    public JoueurController(){
        this.joueurService = new JoueurService();
    }
    public void afficherDetailsJoueur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du joueur dont vous voulez afficher les informations ?");
        long identifiant = scanner.nextLong();
        Joueur joueur = joueurService.getJoueur(identifiant);
        System.out.println("Le joueur selectionne s'appelle "+joueur.getPrenom()+" "+joueur.getNom());


    }

}
