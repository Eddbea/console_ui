package com.eddbea.tennis;

import com.eddbea.tennis.controller.EpreuveController;
import com.eddbea.tennis.controller.JoueurController;
import com.eddbea.tennis.controller.ScoreController;
import com.eddbea.tennis.controller.TournoiController;

public class UI {
    public static void main(String[] args) {

        JoueurController joueurController = new JoueurController();
        //joueurController.afficherDetailsJoueur();
        //joueurController.creerJoueur();
        //TournoiController tournoiController = new TournoiController();
        //tournoiController.afficheDetailTournoi();
        //tournoiController.creerTournoi();
        //joueurController.renommeJoueur();
        //joueurController.reprenommeJoueur();
        //joueurController.changeSexeJoueur();
        //joueurController.reprenommeJoueur();
        //joueurController.renommeJoueur();
        //joueurController.creerJoueur();
        //joueurController.supprimeJoueur();
        TournoiController tournoiController = new TournoiController();
        //tournoiController.supprimeTournoi();
        //tournoiController.afficheDetailTournoi();
        ScoreController scoreController = new ScoreController();
        //scoreController.afficheDetailScore();
        EpreuveController epreuveController = new EpreuveController();
        epreuveController.afficheDetailEpreuve();
    }
}