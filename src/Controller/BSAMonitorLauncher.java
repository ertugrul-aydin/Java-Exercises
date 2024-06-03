package controller;

import Model.Score;
import Model.Vak;


import java.util.Scanner;

public class BSAMonitorLauncher {
    public static void main(String[] args) {
        final double BOVENGRENS_CIJFER = 10.0;
        final double ONDERGRENS_CIJFER = 1.0;
        final double CESUUR = 5.5;
        final double BSA_RATIO = 5/6.0;
        final int TOTAAL_TE_BEHALEN_PUNTEN = 28;
        int totaalBehaaldeStudiePunten = 0;

        // Initiëer de vakken (namen en punten).
        Vak[] vakken = new Vak[7];
        vakken[0] = new Vak("Project Fasten Your Seatbelts", 12, CESUUR);
        vakken[1] = new Vak("Programming", 3, CESUUR);
        vakken[2] = new Vak("Databases", 3, CESUUR);
        vakken[3] = new Vak("Personal skills", 2, CESUUR);
        vakken[4] = new Vak("Project Skills", 2, CESUUR);
        vakken[5] = new Vak("OOP", 3, CESUUR);
        vakken[6] = new Vak("User Interaction", 3, CESUUR);

        Score[] scores = new Score[7];

        // Vraag de gebruiker om input en sla dit op in de array scores.
        Scanner invoer = new Scanner(System.in);
        System.out.println("Voer behaalde cijfers in:");
        for (int vakTeller = 0; vakTeller < 7; vakTeller++) {
            boolean onjuisteInvoer = true;
            while (onjuisteInvoer) {
                System.out.print(vakken[vakTeller].getNaam() + ": ");
                double cijfer = invoer.nextDouble();
                if (cijfer < ONDERGRENS_CIJFER || cijfer > BOVENGRENS_CIJFER) {
                    System.out.printf("Ongeldige invoer!\nHet in te voeren cijfer dient tussen de %.1f en %.1f te zijn.\nProbeer nogmaals: ", ONDERGRENS_CIJFER, BOVENGRENS_CIJFER );
                } else {
                    scores[vakTeller] = new Score(vakken[vakTeller], cijfer);
                    totaalBehaaldeStudiePunten += scores[vakTeller].getBehaaldePunten();
                    onjuisteInvoer = false;
                }
            }
        }

        // print overzicht
        System.out.println();
        for (int scoreTeller = 0; scoreTeller < scores.length; scoreTeller++) {
            System.out.printf("Vak/project: %-30s Cijfer: %-4.1f Behaalde punten: %-3d\n",
                    scores[scoreTeller].getVak().getNaam(), scores[scoreTeller].getCijfer(), scores[scoreTeller].getBehaaldePunten());
        }

        // print totaal aantal behaalde punten
        System.out.printf("\nTotaal behaalde studiepunten: %d/%d\n", totaalBehaaldeStudiePunten, TOTAAL_TE_BEHALEN_PUNTEN); // lege regel
        // print BSA waarschuwing als behaalde punten kleiner dan gegeven ratio
        if (totaalBehaaldeStudiePunten < BSA_RATIO * TOTAAL_TE_BEHALEN_PUNTEN) {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }
    }
}
