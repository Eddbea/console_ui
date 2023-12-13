package com.eddbea.tennis.controller;

import com.eddbea.tennis.entity.Score;
import com.eddbea.tennis.service.ScoreService;

import java.util.Scanner;

public class ScoreController {
    Scanner scanner = new Scanner(System.in);
    private ScoreService scoreService;

    public ScoreController() {
        this.scoreService = new ScoreService();
    }

    public void afficheDetailScore() {
        System.out.println("Quel est l'identifiant du score dont vous souhaitez afficher les informations ?");
        long idScore = scanner.nextLong();
        Score score = scoreService.getScore(idScore);
        System.out.println("Voici le score demande SET1 = " + score.getSet1());
        System.out.println();
        System.out.println("Voici le score demande SET2 = " + score.getSet2());
        if (score.getSet3() != null) {
            System.out.println();
            System.out.println("Voici le score demande SET3 = " + score.getSet3());
        }
        if (score.getSet4() != null) {
            System.out.println();
            System.out.println("Voici le score demande SET4 = " + score.getSet4());
        }
        if (score.getSet5() != null) {
            System.out.println();
            System.out.println("Voici le score demande SET5 = " + score.getSet5());
        }
    }
}
