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

        int scoreOrigineSet1 = score.getSet1();
        if ((scoreOrigineSet1 == 0) || (scoreOrigineSet1 == 1) || (scoreOrigineSet1 == 2) || (scoreOrigineSet1 == 3) || (scoreOrigineSet1 == 4)) {
            System.out.println("Voici le score demande 1er set= 6/" + scoreOrigineSet1);
        } else if ((scoreOrigineSet1 == 5) || (scoreOrigineSet1 == 6)) {
            System.out.println("Voici le score demande 1er set= 7/" + scoreOrigineSet1);
        } else if (scoreOrigineSet1 < 0) {
            int returnPositif = Math.abs(scoreOrigineSet1);
            if (returnPositif == 5) {
                System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
            } else if (returnPositif == 6) {
                System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
            } else if ((returnPositif == 4) || (returnPositif == 3) || (returnPositif == 2) || (returnPositif == 1)) {
                System.out.println("Voici le score demande 1er set= " + returnPositif + "/6");
            }
            System.out.println();
        }
        int scoreOrigineSet2 = score.getSet2();
        if ((scoreOrigineSet2 == 0) || (scoreOrigineSet2 == 1) || (scoreOrigineSet2 == 2) || (scoreOrigineSet2 == 3) || (scoreOrigineSet2 == 4)) {
            System.out.println("Voici le score demande 1er set= 6/" + scoreOrigineSet2);
        } else if ((scoreOrigineSet2 == 5) || (scoreOrigineSet2 == 6)) {
            System.out.println("Voici le score demande 1er set= 7/" + scoreOrigineSet2);
        } else if (scoreOrigineSet2 < 0) {
            int returnPositif = Math.abs(scoreOrigineSet2);
            if (returnPositif == 5) {
                System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
            } else if (returnPositif == 6) {
                System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
            } else if ((returnPositif == 4) || (returnPositif == 3) || (returnPositif == 2) || (returnPositif == 1)) {
                System.out.println("Voici le score demande 1er set= " + returnPositif + "/6");
            }
            System.out.println();
        }
        if (score.getSet3() != null) {
            int scoreOrigineSet3 = score.getSet3();
            if ((scoreOrigineSet3 == 0) || (scoreOrigineSet3 == 1) || (scoreOrigineSet3 == 2) || (scoreOrigineSet3 == 3) || (scoreOrigineSet3 == 4)) {
                System.out.println("Voici le score demande 1er set= 6/" + scoreOrigineSet3);
            } else if ((scoreOrigineSet3 == 5) || (scoreOrigineSet3 == 6)) {
                System.out.println("Voici le score demande 1er set= 7/" + scoreOrigineSet3);
            } else if (scoreOrigineSet3 < 0) {
                int returnPositif = Math.abs(scoreOrigineSet3);
                if (returnPositif == 5) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
                } else if (returnPositif == 6) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
                } else if ((returnPositif == 4) || (returnPositif == 3) || (returnPositif == 2) || (returnPositif == 1)) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/6");
                }
                System.out.println();
            }
        }
        if (score.getSet4() != null) {
            int scoreOrigineSet4 = score.getSet4();
            if ((scoreOrigineSet4 == 0) || (scoreOrigineSet4 == 1) || (scoreOrigineSet4 == 2) || (scoreOrigineSet4 == 3) || (scoreOrigineSet4 == 4)) {
                System.out.println("Voici le score demande 1er set= 6/" + scoreOrigineSet4);
            } else if ((scoreOrigineSet4 == 5) || (scoreOrigineSet4 == 6)) {
                System.out.println("Voici le score demande 1er set= 7/" + scoreOrigineSet4);
            } else if (scoreOrigineSet4 < 0) {
                int returnPositif = Math.abs(scoreOrigineSet4);
                if (returnPositif == 5) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
                } else if (returnPositif == 6) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
                } else if ((returnPositif == 4) || (returnPositif == 3) || (returnPositif == 2) || (returnPositif == 1)) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/6");
                }
                System.out.println();
            }
        }
        if (score.getSet5() != null) {
            int scoreOrigineSet5 = score.getSet5();
            if ((scoreOrigineSet5 == 0) || (scoreOrigineSet5 == 1) || (scoreOrigineSet5 == 2) || (scoreOrigineSet5 == 3) || (scoreOrigineSet5 == 4)) {
                System.out.println("Voici le score demande 1er set= 6/" + scoreOrigineSet5);
            } else if ((scoreOrigineSet5 == 5) || (scoreOrigineSet5 == 6)) {
                System.out.println("Voici le score demande 1er set= 7/" + scoreOrigineSet5);
            } else if (scoreOrigineSet5 < 0) {
                int returnPositif = Math.abs(scoreOrigineSet5);
                if (returnPositif == 5) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
                } else if (returnPositif == 6) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/7");
                } else if ((returnPositif == 4) || (returnPositif == 3) || (returnPositif == 2) || (returnPositif == 1)) {
                    System.out.println("Voici le score demande 1er set= " + returnPositif + "/6");
                }
                System.out.println();
            }
        }
    }
}