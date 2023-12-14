package com.eddbea.tennis.controller;

import com.eddbea.tennis.entity.Epreuve;
import com.eddbea.tennis.entity.Tournoi;
import com.eddbea.tennis.service.EpreuveService;
import com.eddbea.tennis.service.TournoiService;

import java.util.Scanner;

public class EpreuveController {

    Scanner scanner = new Scanner(System.in);
    private EpreuveService epreuveService;

    public EpreuveController() {
        this.epreuveService = new EpreuveService();
    }
    public void afficheDetailEpreuve() {
        System.out.println("Quel est l'identifiant du tournoi dont vous voulez afficher les informations ?");
        long idEpreuve = scanner.nextLong();
        Epreuve epreuve = epreuveService.getEpreuve(idEpreuve);
        System.out.println("L'Epreuve selectionnee se deroule en " + epreuve.getAnnee());
    }

}
