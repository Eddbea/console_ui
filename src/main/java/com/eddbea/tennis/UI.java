package com.eddbea.tennis;

import com.eddbea.tennis.controller.JoueurController;
import com.eddbea.tennis.controller.TournoiController;

public class UI {
    public static void main(String[] args) {

        JoueurController joueurController = new JoueurController();
        //joueurController.afficherDetailsJoueur();
        //joueurController.creerJoueur();
        //TournoiController tournoiController = new TournoiController();
        //tournoiController.afficheDetailTournoi();
        //tournoiController.creerTournoi();
        joueurController.renommeJoueur();

        
    }
}