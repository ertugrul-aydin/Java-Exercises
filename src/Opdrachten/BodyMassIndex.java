package Opdrachten;

import java.util.Scanner;

/*
 * @author Ertugrul Aydin
 * Dit programma berekent op basis van lengte en gewicht de bmi-waarde,
 * afhankelijk van de uitkomst krijg de gebruiker een melding */
public class BodyMassIndex {

    public static void main(String[] args) {

        int lengte;
        double gewicht;
        Scanner input = new Scanner(System.in);
        double bmi;
        final int OVERGEWICHT_GRENS = 25;

        // Gebruiker om input vragen mbv scanner
        System.out.print("Geef je lengte in centimeters: ");
        lengte = input.nextInt();
        System.out.print("Geef je gewicht in kilogram: ");
        gewicht = input.nextDouble();
        //bmi uitrekenen
        double lengteInMeters = lengte / 100.0;
        bmi = gewicht / lengteInMeters * lengteInMeters;
        // Toon het resultaat
        System.out.println("Jouw BMI is: " + bmi);
        if (bmi > OVERGEWICHT_GRENS) {
            System.out.println("Je hebt overgewicht.");
        } else {
            System.out.println("Je bent goed op gewicht.");
        }
    }
}
