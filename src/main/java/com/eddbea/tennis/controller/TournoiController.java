package com.eddbea.tennis.controller;

import com.eddbea.tennis.entity.Tournoi;
import com.eddbea.tennis.service.TournoiService;

import java.util.Scanner;

public class TournoiController {

    Scanner scanner = new Scanner(System.in);
    private TournoiService tournoiService;

    public TournoiController() {
        this.tournoiService = new TournoiService();
    }

    public void afficheDetailTournoi() {
        System.out.println("Quel est l'identifiant du tournoi dont vous voulez afficher les informations ?");
        long idTournoi = scanner.nextLong();
        Tournoi tournoi = tournoiService.getTournoi(idTournoi);
        System.out.println("Le joueur selectionne s'appelle " + tournoi.getNom() + " " + tournoi.getCode());
    }

    public void creerTournoi(){
        Tournoi tournoiCree = new Tournoi();
        System.out.println("Quel est le nom du Tournoi que vous souhaitez creer");
        String nomTournoi = scanner.nextLine();
        tournoiCree.setNom(nomTournoi);
        System.out.println("Quel est le code du tournoi que vous souhaitez creer");
        String codeTournoi = scanner.nextLine();
        tournoiCree.setCode(codeTournoi);
        tournoiService.createTournoi(tournoiCree);
    }
    public void supprimeTournoi() {
        System.out.println("Quel est l'identifiant du tournoi que vous voulez supprimer ?");
        long identifiant = scanner.nextLong();
        scanner.nextLine();
        tournoiService.deleteTournoi(identifiant);
    }
}
