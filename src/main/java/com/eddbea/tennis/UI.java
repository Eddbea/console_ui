package com.eddbea.tennis;

import com.eddbea.tennis.controller.JoueurController;

public class UI {
    public static void main(String[] args) {
        JoueurController controller = new JoueurController();
        controller.afficherDetailsJoueur();
    }
}