package Opdrachten;

// @author Ertugrul Aydin
// Dit programma berekent op basis van het geboortejaar de leeftijd,
// die de gebruiker dit jaar zal bereiken en geeft een boodschap terug

import java.util.Scanner;

public class LeeftijdBerekeningLauncher {

    public static void main(String[] args) {
        // Declareren van de variabelen
        Scanner input = new Scanner(System.in);
        String naam;
        int geboortejaar;
        final int HUIDIG_JAAR = 2024;
        int leeftijd;

        // Vragen stellen en antwoord verwerken.
        System.out.print("Hoe heet je? ");
        naam = input.nextLine();
        System.out.println("Wat is je geboortejaar ?");
        geboortejaar = input.nextInt();

        // Leeftijd berekenen en resultaat tonen.
        leeftijd = HUIDIG_JAAR - geboortejaar;
        System.out.println();
        System.out.println("Beste " + naam + ", eind " + HUIDIG_JAAR + " zal je leeftijd " + leeftijd + " zijn.");

    }
}
