package Opdrachten;

import java.util.Scanner;

public class Methodes3 {

    public static void main(String[] args) {
        Scanner inputVrager = new Scanner(System.in);

        // SterrenVierkant
        toonSterrenVierkant();

        // Rij van vijf woorden
        System.out.print("Welke woord wil je vijf keer zien? ");
        String ingevoerdWoord = inputVrager.next();
        toonWoordVijfKeer(ingevoerdWoord);

        // Eerlijk delen
        System.out.println("Hoeveel euromunten wil je verdelen? ");
        int aantalMunten = inputVrager.nextInt();
        System.out.println("Met hoeveel personen? ");
        int aantalPersonen = inputVrager.nextInt();
        verdeelMuntenEerlijk(aantalMunten, aantalPersonen);

        // Bereken wisselgeld
        System.out.print("Hoeveel moet je betalen? ");
        double teBetalen = inputVrager.nextDouble();
        System.out.print("Hoeveel heb je betaald? ");
        double betaald = inputVrager.nextDouble();
        double wisselgeld = berekenWisselgeld(teBetalen, betaald);
        System.out.println("Je krijgt " + wisselgeld + " terug");

        // Bereken wisselgeld gevorderd
        System.out.print("Hoeveel moet je betalen? ");
        teBetalen = inputVrager.nextDouble();
        System.out.print("Hoeveel heb je betaald? ");
        betaald = inputVrager.nextDouble();
        wisselgeld = berekenWisselgeldGevorderd(teBetalen, betaald);
        System.out.println("Je krijgt " + wisselgeld + " terug");

    }

    public static void toonSterrenVierkant() {
        System.out.println("* * * *");
        System.out.println("* * * *");
        System.out.println("* * * *");
        System.out.println("* * * *");
    }

    public static void toonWoordVijfKeer(String mpWoord) {
        System.out.println(mpWoord + mpWoord + mpWoord + mpWoord + mpWoord);
    }

    public static void verdeelMuntenEerlijk(int mpAantalMunten, int mpAantalMensen) {
        int muntenPerPersoon = mpAantalMunten / mpAantalMensen;
        int restMunten = mpAantalMunten % mpAantalMensen;
        System.out.println("Als je " + mpAantalMunten + " euromunten verdeeld over " +
                mpAantalMensen + " mensen, dan krijgt ieder " + muntenPerPersoon +
                " munten en blijven er " + restMunten + " over.");
    }

    public static double berekenWisselgeld(double mpTeBetalen, double mpBetaald) {
        return mpBetaald - mpTeBetalen;
    }

    public static double berekenWisselgeldGevorderd(double mpTeBetalen, double mpBetaald) {
        double verschil = mpBetaald - mpTeBetalen;
        return (Math.round(verschil * 20) / 20.0);
    }
}