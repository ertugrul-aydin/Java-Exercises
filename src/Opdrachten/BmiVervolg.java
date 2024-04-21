package Opdrachten;

/*
 * @ author Ertugrul Aydin
 * Dit programma bekenen op basis van lengte en gewicht */

import java.util.Scanner;

public class BmiVervolg {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declareer de variebelen

        double lengte;
        double kg;
        double bmi;

        // Gebruiker om input te vragen
        System.out.println("Geef je lengte in centimeters: ");
        lengte = input.nextDouble();

        System.out.println("Geef je gewicht in kilogram:  ");
        kg = input.nextDouble();

        // bmi uitberekenen mbv(met behulp van) method
        bmi = berekenBMI(lengte, kg);

        // Toon het resultaat
        System.out.println();
        System.out.println("Jouw BMI is: " + bmi + " (" + bepaalCategorie(bmi) + ")");

    }

    public static double berekenBMI(double mpLengte, double mpGewicht) {
        double lengteInMeters = mpLengte / 100.0;
        return Math.round(10 * mpGewicht / Math.pow(lengteInMeters, 2)) / 10.0;
    }

    public static String bepaalCategorie(double mpBmi) {
        // Declareer de constanten voor de grenzen.
        final double ONDERGEWICHT_GRENS = 18.5;
        final double OVERGEWICHT_GRENS = 25.0;
        final double OBESITAS_GRENS = 30.0;
        // Bepaal de juiste categorie.
        String categorie = "";
        if (mpBmi < ONDERGEWICHT_GRENS) {
            categorie = "Ondergewicht";
        } else if (mpBmi <= OVERGEWICHT_GRENS) {
            categorie = "Gezond gewicht";
        } else if (mpBmi <= OBESITAS_GRENS) {
            categorie = "Overgewicht";
        } else {
            categorie = "Obesitas";
        }
        return categorie;
    }


}
