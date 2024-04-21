package Opdrachten;

import java.util.Scanner;


public class GemiddeldeUitrekent {

    public static void main(String[] args) {
        // Variabelen klaarzetten, om het gemiddelde uit te rekenen
        // moet je de som van de getallen en het aantal getallen bijhouden.
        Scanner input = new Scanner(System.in);
        int eersteGetal;
        int tweedeGetal;
        int volgendeGetal; // dit kunnen we steeds hergebruiken!
        int somVanGetallen;
        int aantalGetallen;
        double gemiddelde;
        String antwoordVerder;
        boolean gaDoor = true;

        // Communicatie met de gebruiker en in elk geval twee getallen vragen.
        System.out.println("Dit programma berekent het gemiddelde van twee of meer getallen.");
        System.out.print("Geef het eerste getal: ");
        eersteGetal = input.nextInt();
        System.out.print("Geef het tweede getal: ");
        tweedeGetal = input.nextInt();
        // Tussenstap: som bepalen van de eerste twee getallen en aantal op 2.
        somVanGetallen = eersteGetal + tweedeGetal;
        aantalGetallen = 2;

        // Nu de loop in, vragen of gebruiker verder wil
        while (gaDoor) {
            System.out.print("Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ");
            antwoordVerder = input.next();

            // Controle op juistheid, ja of nee.
            // antwoord vergelijken met "ja" of "nee", Je moet hier de equals() methode van een String gebruiken.
            // Als het antwoord niet 'ja' is en niet 'nee' dan moet je mopperen.
            while (!antwoordVerder.equals("ja") && !antwoordVerder.equals("nee")) {
                System.out.println("Je moet 'ja' of 'nee' antwoorden!");
                System.out.print("Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ");
                antwoordVerder = input.next();
            }

            if (antwoordVerder.equals("nee")) {
                gaDoor = false;
            } else {
                // Je hoeft hier niet nog op 'ja' te controleren, als het geen 'nee' is, dan is het 'ja'.
                System.out.print("Geef het volgende getal: ");
                volgendeGetal = input.nextInt();
                somVanGetallen += volgendeGetal; // som ophogen met volgende getal.
                aantalGetallen++; // aantal ophogen met 1;
            }
        }
        // Resultaat uitrekenen en printen. Let op: integer deling voorkomen, maak er een double van.
        gemiddelde = (double) somVanGetallen / aantalGetallen;
        System.out.println("Het gemiddelde van jouw " + aantalGetallen + " getallen is: "  + gemiddelde);
    }

}
